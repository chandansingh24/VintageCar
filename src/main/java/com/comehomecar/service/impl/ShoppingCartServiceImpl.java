package com.comehomecar.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comehomecar.domain.CartItem;
import com.comehomecar.domain.ShoppingCart;
import com.comehomecar.repository.ShoppingCartRepository;
import com.comehomecar.service.CartItemService;
import com.comehomecar.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	
	@Override
	public ShoppingCart updateShoppingCart(ShoppingCart shoppingCart) {
	       BigDecimal cartTotal = new BigDecimal(0); 
	       
	       List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
	       
	       for (CartItem cartItem : cartItemList) {
	    	      if(cartItem.getCar().getInStockNumber() > 0) {
	    	    	    cartItemService.updateCartItem(cartItem);
	    	    	      cartTotal = cartTotal.add(cartItem.getSubtotal());
	    	      }
	       }
	       
	       shoppingCart.setGrandTotal(cartTotal);
	       
	       shoppingCartRepository.save(shoppingCart);
	       
	       return shoppingCart;
	}
	
	public void clearShoppingCart(ShoppingCart shoppingCart) {
       List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);
		
		for (CartItem cartItem : cartItemList) {
			cartItem.setShoppingCart(null);
			cartItemService.save(cartItem);
		}
		
		shoppingCart.setGrandTotal(new BigDecimal(0));
		
		shoppingCartRepository.save(shoppingCart);
	}	

}

package com.comehomecar.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;

//	private String author;
	private String owner;

//	private String publisher;
	private String company;
	
//	private String publicationDate;
	private String manufacturingDate;
	
//	private String language;
	private int numberOfDoors;
	
	private String category;
	
//	private int numberOfPages;
	private int numberOfOccupancy;
	
//	private String format;
	private String model;
	
//	private int isbn;
	private String uniqueIdentification;
	
//	private double shippingWeight;
	private double totalWeight;
	
	private double listPrice;
	private double ourPrice;
	private boolean active=true;
	
	@Column(columnDefinition="text")
	private String description;
	private int inStockNumber;
	
	@Transient
	private MultipartFile carImage;
	
	@OneToMany(mappedBy = "car")
	@JsonIgnore
	private List<CarToCartItem> carToCartItemList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	

//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getPublisher() {
//		return publisher;
//	}
//
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//
//	public String getPublicationDate() {
//		return publicationDate;
//	}
//
//	public void setPublicationDate(String publicationDate) {
//		this.publicationDate = publicationDate;
//	}
//
//	public String getLanguage() {
//		return language;
//	}
//
//	public void setLanguage(String language) {
//		this.language = language;
//	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}


	//************************************
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfOccupancy() {
		return numberOfOccupancy;
	}

	public void setNumberOfOccupancy(int numberOfOccupancy) {
		this.numberOfOccupancy = numberOfOccupancy;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUniqueIdentification() {
		return uniqueIdentification;
	}

	public void setUniqueIdentification(String uniqueIdentification) {
		this.uniqueIdentification = uniqueIdentification;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}
	
	//***************************************

	
//	public int getNumberOfPages() {
//		return numberOfPages;
//	}
//
//	public void setNumberOfPages(int numberOfPages) {
//		this.numberOfPages = numberOfPages;
//	}
//
//	public String getFormat() {
//		return format;
//	}
//
//	public void setFormat(String format) {
//		this.format = format;
//	}
//
//	public int getIsbn() {
//		return isbn;
//	}
//
//	public void setIsbn(int isbn) {
//		this.isbn = isbn;
//	}
//
//	public double getShippingWeight() {
//		return shippingWeight;
//	}
//
//	public void setShippingWeight(double shippingWeight) {
//		this.shippingWeight = shippingWeight;
//	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getOurPrice() {
		return ourPrice;
	}

	public void setOurPrice(double ourPrice) {
		this.ourPrice = ourPrice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public MultipartFile getCarImage() {
		return carImage;
	}

	public void setCarImage(MultipartFile carImage) {
		this.carImage = carImage;
	}

	public List<CarToCartItem> getCarToCartItemList() {
		return carToCartItemList;
	}

	public void setCarToCartItemList(List<CarToCartItem> carToCartItemList) {
		this.carToCartItemList = carToCartItemList;
	}		

}

package com.straypets.shiva.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Straypets {
@Id
	private int sNo;
	private String breed;
	private int count;
	private String price;
	private String dateOfAdoption;
	private String health;
	private String discounts;
	private String offers;
	public int getSno() {
		return sNo;
	}
	public void setSno(int sNo) {
		this.sNo = sNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDateOfAdoption() {
		return dateOfAdoption;
	}
	public void setDateOfAdoption(String dateOfAdoption) {
		this.dateOfAdoption = dateOfAdoption;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getDiscounts() {
		return discounts;
	}
	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	

}

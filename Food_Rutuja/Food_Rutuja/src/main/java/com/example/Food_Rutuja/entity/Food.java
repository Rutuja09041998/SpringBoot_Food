package com.example.Food_Rutuja.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String foodname;
	private int price;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Food(int id, String foodname, int price) {
		super();
		this.id = id;
		this.foodname = foodname;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", foodname=" + foodname + ", price=" + price + "]";
	}
	
}

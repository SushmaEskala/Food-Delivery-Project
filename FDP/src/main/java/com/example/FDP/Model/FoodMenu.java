package com.example.FDP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FoodMenu {

	@Id
	@GeneratedValue
	private Integer Sno;
	private String items;
	private Integer price;
	public Integer getSno() {
		return Sno;
	}
	public void setSno(Integer sno) {
		Sno = sno;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "FoodMenu [Sno=" + Sno + ", items=" + items + ", price=" + price + "]";
	}
	
}

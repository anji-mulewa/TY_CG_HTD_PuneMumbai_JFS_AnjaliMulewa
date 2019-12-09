package com.capgemini.SimpleJDBC.Hotel_Info;

public class Hotelinfo {
	private int Item_code;
	private String Food_name;
	private double Price;
	public int getItem_code() {
		return Item_code;
	}
	public void setItem_code(int item_code) {
		Item_code = item_code;
	}
	public String getFood_name() {
		return Food_name;
	}
	public void setFood_name(String food_name) {
		Food_name = food_name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	@Override
	public String toString() {
		return "Hotelinfo [Item_code=" + Item_code + ", Food_name=" + Food_name + ", Price=" + Price + "]";
	}//end of toString
	
}//end of class

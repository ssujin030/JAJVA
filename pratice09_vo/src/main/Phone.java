package main;

public class Phone {
	private String brand;
	private String color;
	private String price;
	
	public Phone() {
		
	}
	
	
	public Phone(String brand,String color,String price) {
		this.brand = brand;
		this.color = color;
		this.price = price;			
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColoer() {
		return color;
	}
	public void setColoer(String coloer) {
		this.color = coloer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String toString() {
		return "brand:"+brand+",color:"+color+",price:"+price;
	}


}

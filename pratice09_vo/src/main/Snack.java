package main;

public class Snack {
	
	//no arg contructor
	public Snack() {
		
	}
	
	
	//all arg contructor
	public Snack(String name, int price) {
		this.name=name;
		this.price=price;
		
	}
	
	//private
	private String name;
	private int price;

    //getter  /setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//getInfo 모든거 출력
	public String toString() {
		return "name:"+name+",price:"+price;
	}


}

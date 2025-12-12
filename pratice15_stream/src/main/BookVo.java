package main;

public class BookVo {
	private String title;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [title=" + title + ", price=" + price + "]";
	}
	public BookVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookVo(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	

}

package book;

public class BookVo {
	
	private String titile;
	private int price;
	
	
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public int getPrice() {
		return price;
	}
	public BookVo() {

	}
	public void setPrice(int price) {
		this.price = price;
	}
	public BookVo(String titile, int price) {
		
		this.titile = titile;
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [titile=" + titile + ", price=" + price + "]";
	}

}

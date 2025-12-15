package order;

public class OrderVo {
	
	private String menu;
	private int price;
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderVo [menu=" + menu + ", price=" + price + "]";
	}
	public OrderVo(String menu, int price) {
	
		this.menu = menu;
		this.price = price;
	}
	public OrderVo() {
		
	} 
	

}

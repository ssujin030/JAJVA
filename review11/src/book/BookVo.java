package book;

public class BookVo {
	
private String Tite;

private int price;

public String getTite() {
	return Tite;
}

public void setTite(String tite) {
	Tite = tite;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "BookVo [Tite=" + Tite + ", price=" + price + "]";
}

public BookVo(String tite, int price) {
	
	Tite = tite;
	this.price = price;
}

public BookVo() {
	
	// TODO Auto-generated constructor stub
}

}

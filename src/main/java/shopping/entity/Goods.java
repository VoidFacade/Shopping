package shopping.entity;
//商品类
public class Goods {
	
	private String id;
	private String detalis;
	private int stock;
	private double price;
	public Goods() {
	}
	public Goods(String id, String detalis, int stock, double price) {
		super();
		this.id = id;
		this.detalis = detalis;
		this.stock = stock;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDetalis() {
		return detalis;
	}
	public void setDetalis(String detalis) {
		this.detalis = detalis;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", detalis=" + detalis + ", stock=" + stock + ", price=" + price + "]";
	}
	
	
	
}

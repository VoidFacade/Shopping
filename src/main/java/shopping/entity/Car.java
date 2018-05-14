package shopping.entity;

public class Car {
	
	private Long id;
	private Long userID;
	private long goodsID;
	public Car() {
	}
	public Car(Long id, Long userID, long goodsID) {
		this.id = id;
		this.userID = userID;
		this.goodsID = goodsID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public long getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(long goodsID) {
		this.goodsID = goodsID;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", userID=" + userID + ", goodsID=" + goodsID + "]";
	}
	
	
	
	
}

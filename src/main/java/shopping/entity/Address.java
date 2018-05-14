package shopping.entity;

public class Address {
	
	private Long id;
	private String detalis;
	private Long userID;
	public Address() {
	}
	public Address(Long id, String detalis, Long userID) {
		this.id = id;
		this.detalis = detalis;
		this.userID = userID;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetalis() {
		return detalis;
	}
	public void setDetalis(String detalis) {
		this.detalis = detalis;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", detalis=" + detalis + ", userID=" + userID + "]";
	}
	
	
	

}

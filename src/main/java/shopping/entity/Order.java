package shopping.entity;

public class Order {
	
	private Long userId;
	private String state;
	private Long addressId;
	private Long orderId;
	
	
	
	public Order() {
	}



	public Order(Long userId, String state, Long addressId, Long orderId) {
		this.userId = userId;
		this.state = state;
		this.addressId = addressId;
		this.orderId = orderId;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Long getAddressId() {
		return addressId;
	}



	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	@Override
	public String toString() {
		return "Order [userId=" + userId + ", state=" + state + ", addressId=" + addressId + ", orderId=" + orderId
				+ "]";
	}
	
	
	
	
	
}

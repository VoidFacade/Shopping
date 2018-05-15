package shopping.entity;

public class OrderDetalis {
	
	private Long orderId;
	private String goodsId;
	private int conunt;
	public OrderDetalis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetalis(Long orderId, String goodsId, int conunt) {
		super();
		this.orderId = orderId;
		this.goodsId = goodsId;
		this.conunt = conunt;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public int getConunt() {
		return conunt;
	}
	public void setConunt(int conunt) {
		this.conunt = conunt;
	}
	@Override
	public String toString() {
		return "OrderDetalis [orderId=" + orderId + ", goodsId=" + goodsId + ", conunt=" + conunt + "]";
	}
	
	
	
	
}

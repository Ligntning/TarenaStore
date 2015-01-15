package sduwh.dream.pojo;

public class OrderLine {
	private Integer lineId;
	private Integer orderId;
	private Integer productId;
	private float amount;
	public Integer getLineId() {
		return lineId;
	}
	public void setLineId(Integer lineId) {
		this.lineId = lineId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "OrderLine [lineId=" + lineId + ", orderId=" + orderId
				+ ", productId=" + productId + ", amout=" + amount + "]";
	}
	
}

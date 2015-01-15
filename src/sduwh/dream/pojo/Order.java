package sduwh.dream.pojo;

public class Order {
	private Integer orderId;
	private String name;
	private float cost;
	private String userId;
	private float statusId;
	private float paywayId;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public float getStatusId() {
		return statusId;
	}
	public void setStatusId(float statusId) {
		this.statusId = statusId;
	}
	public float getPaywayId() {
		return paywayId;
	}
	public void setPaywayId(float paywayId) {
		this.paywayId = paywayId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", cost="
				+ cost + ", userId=" + userId + ", statusId=" + statusId
				+ ", paywayId=" + paywayId + "]";
	}
	
}

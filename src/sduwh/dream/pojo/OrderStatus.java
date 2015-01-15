package sduwh.dream.pojo;

public class OrderStatus {
	private float statusId;
	private String name;
	private String description;
	public float getStatusId() {
		return statusId;
	}
	public void setStatusId(float statusId) {
		this.statusId = statusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "OrderStatus [statusId=" + statusId + ", name=" + name
				+ ", description=" + description + "]";
	}
	
}

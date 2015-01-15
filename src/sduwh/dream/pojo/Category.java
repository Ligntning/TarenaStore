package sduwh.dream.pojo;

public class Category {
	private Integer categoryid;
	private String name;
	private String description;
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
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
		return "Category [categoryid=" + categoryid + ", name=" + name
				+ ", description=" + description + "]";
	}
	
}

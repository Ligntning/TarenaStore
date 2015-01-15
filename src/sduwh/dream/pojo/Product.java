package sduwh.dream.pojo;

import java.awt.Image;

public class Product {
	private Integer productId;
	private String name;
	private String description;
	private float basePrice;
	private Integer categoryId;
	private String author;
	private String publish;
	private Integer pages;
	private String image;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
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
	public float getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(float basePrice) {
		this.basePrice = basePrice;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer catagoryId) {
		this.categoryId = catagoryId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name
				+ ", description=" + description + ", basePrice=" + basePrice
				+ ", catagoryId=" + categoryId + ", author=" + author
				+ ", publish=" + publish + ", pages=" + pages + ", image="
				+ image + "]";
	}
	
}

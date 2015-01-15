package sduwh.dream.pojo;

public class ContactInfo {
	private String userId;
	private String street1;
	private String street2;
	private String city;
	private String province;
	private String country;
	private String zip;
	private String email;
	private String homePhone;
	private String cellPhone;
	private String officePhone;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	@Override
	public String toString() {
		return "ContactInfo [userId=" + userId + ", street1=" + street1
				+ ", street2=" + street2 + ", city=" + city + ", province="
				+ province + ", country=" + country + ", zip=" + zip
				+ ", emal=" + email + ", homePhone=" + homePhone
				+ ", cellPhone=" + cellPhone + ", officePhone=" + officePhone
				+ "]";
	}
	
}

package sduwh.dream.pojo;

public class PayWay {
	private float paywayId;
	private String payStyle;
	public float getPaywayId() {
		return paywayId;
	}
	public void setPaywayId(float paywayId) {
		this.paywayId = paywayId;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	@Override
	public String toString() {
		return "PayWay [paywayId=" + paywayId + ", payStyle=" + payStyle + "]";
	}
	
}

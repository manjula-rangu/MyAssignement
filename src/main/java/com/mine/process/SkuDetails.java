package com.mine.process;

public class SkuDetails {

	private int count;
	private int price;
	private int promoCount;
	private int promoPrice;
	private String comboId;
	private int comboPrice;
	public SkuDetails(int count, int price) {
		super();
		this.count = count;
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPromoCount() {
		return promoCount;
	}
	public void setPromoCount(int promoCount) {
		this.promoCount = promoCount;
	}
	public int getPromoPrice() {
		return promoPrice;
	}
	public void setPromoPrice(int promoPrice) {
		this.promoPrice = promoPrice;
	}
	public String getComboId() {
		return comboId;
	}
	public void setComboId(String comboId) {
		this.comboId = comboId;
	}
	public int getComboPrice() {
		return comboPrice;
	}
	public void setComboPrice(int comboPrice) {
		this.comboPrice = comboPrice;
	}
	@Override
	public String toString() {
		return "SkuDetails [count=" + count + ", price=" + price + ", promoCount=" + promoCount + ", promoPrice="
				+ promoPrice + ", comboId=" + comboId + ", comboPrice=" + comboPrice + "]";
	}
	

}

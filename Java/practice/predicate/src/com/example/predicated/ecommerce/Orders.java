package com.example.predicated.ecommerce;

public class Orders {
	private int orderId;
	private String customerName;
	private double totalAmount;
	private String payementStatus;
	private boolean isShipped;

	public Orders() {
	}

	public Orders(int orderId, String customerName, double totalAmount, String payementStatus, boolean isShipped) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.payementStatus = payementStatus;
		this.isShipped = isShipped;
	}

	public boolean isShipped() {
		return isShipped;
	}

	public void setShipped(boolean isShipped) {
		this.isShipped = isShipped;
	}

	public String getPayementStatus() {
		return payementStatus;
	}

	public void setPayementStatus(String payementStatus) {
		this.payementStatus = payementStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Orders [order Id=" + orderId + ", customer Name=" + customerName + ", total amount=" + totalAmount
				+ "]";
	}

}

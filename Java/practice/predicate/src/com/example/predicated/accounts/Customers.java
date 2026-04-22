package com.example.predicated.accounts;

public class Customers {
//	account number, holder name, and current balance.
	private int accountNumber;
	private String name;
	private double balance;

	public Customers() {
	}

	public Customers(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customers [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}

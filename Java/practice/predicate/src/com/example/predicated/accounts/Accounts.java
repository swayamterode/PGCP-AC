package com.example.predicated.accounts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Accounts {
	public static void main(String[] args) {
		Customers c1 = new Customers(112345678, "Swayam", 45000);
		Customers c2 = new Customers(112345679, "Sagar", -5000);
		Customers c3 = new Customers(112345680, "Rahul", -200);
		Customers c4 = new Customers(112345681, "Neha", 30000);

		List<Customers> list = Arrays.asList(c1, c2, c3, c4);

		Predicate<Customers> isOverdrawn = x -> x.getBalance() < 0;

		System.out.println("Overdrawn accounts:");
		list.stream().filter(isOverdrawn).forEach(x -> System.out.println("Account No: " + x.getAccountNumber()));
	}
}
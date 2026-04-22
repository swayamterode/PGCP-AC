package com.example.predicated.ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Orders order1 = new Orders(1, "Swayam", 2323, "PAID", false);
		Orders order2 = new Orders(2, "Raj", 52300, "FAILED", true);
		Orders order3 = new Orders(3, "Arab", 52400, "FAILED", false);
		Orders order4 = new Orders(4, "Ravi", 124999, "PAID", true);

		List<Orders> li = Arrays.asList(order1, order2, order3, order4);

		Predicate<Orders> isPaymentFailed = (x) -> x.getPayementStatus().equals("FAILED");
		Predicate<Orders> isPaidAndNotShipped = (x) -> x.getPayementStatus().equals("PAID") && !x.isShipped()
				&& x.getTotalAmount() > 5000;
		Predicate<Orders> needsAttention = isPaymentFailed.or(isPaidAndNotShipped);
		li.stream().filter(needsAttention).forEach(x -> System.out.println("Order id: " + x.getOrderId()));

	}
}

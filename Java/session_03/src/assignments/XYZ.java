package assignments;

import java.util.Scanner;

public class XYZ {

    static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity(); // Ek product pe kharch = price * qty
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // Exactly 5 products ka data lena hai
        Product[] products = new Product[n];

        System.out.println("5 Products ki information enter karo:\n");

        for (int i = 0; i < n; i++) {
            System.out.println("--- Product " + (i + 1) + " ---");
            System.out.print("PID       : ");
            int pid = sc.nextInt();
            System.out.print("Price     : ");
            double price = sc.nextDouble();
            System.out.print("Quantity  : ");
            int qty = sc.nextInt();

            products[i] = new Product(pid, price, qty); // Product object banao
        }

        System.out.println("\n=== Stored Products ===");
        for (Product p : products) {
            p.display();
        }

        int maxPid = products[0].getPid();
        double maxPrice = products[0].getPrice();

        for (int i = 1; i < n; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice(); // Naya max price mila
                maxPid = products[i].getPid();     // Uska PID save karo
            }
        }

        System.out.println("\nSabse zyada price wale product ki details:");
        System.out.println("PID = " + maxPid + " | Price = " + maxPrice);

        // Total amount spent calculate karo using class method
        double totalAmount = calculateTotalAmount(products);
        System.out.printf("%nSabhi products pe total amount kharch: %.2f%n", totalAmount);

        sc.close();
    }
}

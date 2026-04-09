package assignments;

// Product class — pid, price, quantity store karta hai
public class Product {

    // Instance variables
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor — teeno values ek saath lo
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters — XYZ class mein use honge
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Product ki info display karo
    public void display() {
        System.out.printf("PID: %d | Price: %.2f | Quantity: %d%n", pid, price, quantity);
    }
}

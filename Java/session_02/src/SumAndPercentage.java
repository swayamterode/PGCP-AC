import java.util.Scanner;

public class SumAndPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int mark : marks) sum += mark;

        double percentage = (sum / 500.0) * 100;

        System.out.println("\nTotal Marks : " + sum + " / 500");
        System.out.println("Percentage  : " + percentage + "%");

        sc.close();
    }
}

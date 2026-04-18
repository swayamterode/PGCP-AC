import java.util.Scanner;

public class FixingNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name=");
        
        String name = sc.nextLine();
        System.out.println("Enter your age:");

        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Subject");
        String subject = sc.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(subject);

        sc.close();
    }
}

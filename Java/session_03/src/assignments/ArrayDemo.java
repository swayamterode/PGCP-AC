package assignments;

import java.util.Scanner;

// Ye program 17 elements ka jagged array banata hai 5 rows mein
// Aur user se input leta hai, phir sum calculate karta hai
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Jagged array — 5 rows, sizes: 4,4,3,3,3 = 17 total elements
        int[][] arr = new int[5][];
        arr[0] = new int[4];
        arr[1] = new int[4];
        arr[2] = new int[3];
        arr[3] = new int[3];
        arr[4] = new int[3];

        System.out.println("=== 17 Elements ka Jagged Array ===");
        System.out.println("User se har row ke elements lo:\n");

        // Har row ke liye user se elements lo
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + i + " ke " + arr[i].length + " elements enter karo: ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Array print karo aur sum nikalo
        int sum = 0;
        System.out.println("\nArray display (17 elements, 5 rows mein):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
                sum += arr[i][j]; // Har element sum mein add ho raha hai
            }
            System.out.println();
        }

        // Final sum print karo
        System.out.println("\nSabhi 17 elements ka Sum = " + sum);
        sc.close();
    }
}

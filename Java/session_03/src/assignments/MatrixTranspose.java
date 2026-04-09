package assignments;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se matrix ka size lo
        System.out.print("\nMatrix ki rows kitni hain: ");
        int rows = sc.nextInt();
        System.out.print("Matrix ki columns kitni hain: ");
        int cols = sc.nextInt();

        int[][] original = new int[rows][cols];
        // Transpose mein rows aur cols swap ho jaate hain
        int[][] transpose = new int[cols][rows];

        // Original matrix ka input lo
        System.out.println("\nMatrix ke elements enter karo (row by row):");
        for (int i = 0; i < rows; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < cols; j++) {
                original[i][j] = sc.nextInt();
            }
        }

        // Transpose nikalo — row aur column ki position swap karo
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j]; // A[i][j] -> T[j][i]
            }
        }

        // Original matrix print karo
        System.out.println("\nOriginal Matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", original[i][j]);
            }
            System.out.println();
        }

        // Transpose matrix print karo
        System.out.println("\nTranspose Matrix (" + cols + "x" + rows + "):");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%5d", transpose[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}

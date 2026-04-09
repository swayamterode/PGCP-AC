package assignments;

import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][3]; // 1st matrix
		int[][] B = new int[3][3]; // 2nd  matrix
		int[][] C = new int[3][3]; // Result matrix — A * B

		System.out.println("\nMatrix A ke 9 elements enter karo (row by row):");
		for (int i = 0; i < 3; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatrix B ke 9 elements enter karo (row by row):");
		for (int i = 0; i < 3; i++) {
			System.out.print("Row " + i + ": ");
			for (int j = 0; j < 3; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		// Multiplication — C[i][j] = sum of A[i][k] * B[k][j]
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] += A[i][k] * B[k][j]; // Row aur column ka dot product
				}
			}
		}

		System.out.println("\nMatrix A:");
		printMatrix(A);

		System.out.println("\nMatrix B:");
		printMatrix(B);

		System.out.println("\nA x B ka Result (Matrix C):");
		printMatrix(C);

		sc.close();
	}

	static void printMatrix(int[][] mat) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%6d", mat[i][j]);
			}
			System.out.println();
		}
	}
}

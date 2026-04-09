import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		int[][] arr = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.print("Enter number of columns for row " + i + ": ");
			int cols = sc.nextInt();
			arr[i] = new int[cols];

			System.out.print("Enter " + cols + " values for row " + i + ": ");
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\narr values:");
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

		System.out.println("\n\nSum of all rows in the arr!!!\n");
//		for (int i[] : arr) {
//			int sum = 0;
//			for (int j : i) {
//				sum += j;
//				System.out.print(j + "\t");
//			}
//			System.out.println("Sum of " + i + "row: " + i + " is: " + sum);
//			System.out.println();
//		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of " + i + " row " + " is: " + sum);
			System.out.println();
		}
		sc.close();
	}
}

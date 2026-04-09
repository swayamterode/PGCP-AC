import java.util.Scanner;

public class AverageMarksOfStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total no. of students: ");
		int rows = sc.nextInt();
		int[][] arr = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.print("Enter the total subjects for " + (i + 1) + " Student: ");
			int cols = sc.nextInt();
			arr[i] = new int[cols];

			System.out.print("Enter the marks for " + (i + 1) + " subject" + ": ");
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			int sum = 0;
//			int totalCountOfSubjects = 0;
			for (int j = 0; j < arr[i].length; j++) {
//				totalCountOfSubjects++;
//				total  count ko j se bhi replace kr sakte hai but end me ++totalCount krna padega q ki j = 0 index se start hora
//				nahi tho arr[i].length!
				sum += arr[i][j];
				System.out.println();
			}
			System.out.println("Average of " + (i + 1) + " Student is: " + (sum / arr[i].length)
					+ " with total subjects: " + arr[i].length);
		}
		sc.close();
	}

}

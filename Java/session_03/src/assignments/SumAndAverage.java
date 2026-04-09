//Program to show sum and average of 10 element array. Accept array elements from user.
package assignments;

import java.util.Scanner;

public class SumAndAverage {

	protected int sum = 0;
	protected double average = 0;

	public void calculateSumAndAverage(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		average = sum / arr.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

	}

	public static void main(String[] args) {
		int size;
		SumAndAverage obj = new SumAndAverage();
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number:");
		size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of array!");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the " + i + " element: ");
			arr[i] = sc.nextInt();
		}
		obj.calculateSumAndAverage(arr);
		sc.close();
	}
}

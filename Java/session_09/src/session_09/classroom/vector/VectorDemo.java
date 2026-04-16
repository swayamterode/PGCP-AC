package session_09.classroom.vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfVector;
		System.out.print("Enter the size of the vector: ");
		sizeOfVector = sc.nextInt();

		Vector<Integer> vec = new Vector<>(sizeOfVector);
		System.out.println(vec.capacity()); // default is 10 but here we are taking input from use so it will the user's
											// input = capacity!
		for (int i = 0; i < sizeOfVector; i++) {
			System.out.print("Enter the element at index " + i + " : ");
			vec.add(sc.nextInt());
		}

		System.out.println("Elements in vector!");
		for (int itr : vec) {
			System.out.println(itr);
		}

		sc.close();
	}
}

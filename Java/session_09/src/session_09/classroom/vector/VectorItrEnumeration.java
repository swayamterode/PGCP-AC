package session_09.classroom.vector;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorItrEnumeration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfVector;
		System.out.print("Enter the size of the vector: ");
		sizeOfVector = sc.nextInt();

		Vector<Integer> vec = new Vector<>(sizeOfVector);

//		input from user!
		for (int i = 0; i < sizeOfVector; i++) {
			System.out.print("Enter the element at index " + i + " : ");
			vec.add(sc.nextInt());
		}
		Enumeration<Integer> e = vec.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		sc.close();
	}
}

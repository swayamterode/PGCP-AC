package session_09.classroom.stack;

import java.util.Scanner;
import java.util.Stack;

public class GenricStackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>(); // generic stack!
		Scanner sc = new Scanner(System.in);
		int stackSize;
		System.out.print("Enter the size of the stack:");
		stackSize = sc.nextInt();

		for (int i = 0; i < stackSize; i++) {
			System.out.print("Enter the stack element at index " + i + " : ");
			s.add(sc.nextInt());
		}

		System.out.println("After removing element!");
		s.pop();
		System.out.println(s.clone()); // clones and return vector!
		System.out.println(s.empty()); // return true is stack is empty else false!
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		sc.close();
	}
}

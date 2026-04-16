package session_09.classroom.stack;

import java.util.Stack;

public class NonGenericStack {
	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		s.add("Hi");
		s.add(2);
		s.add(null);
		System.out.println(s);
	}
}

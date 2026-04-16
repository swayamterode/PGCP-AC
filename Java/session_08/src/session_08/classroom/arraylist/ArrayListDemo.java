package session_08.classroom.arraylist;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		// non generic values of array list
		ArrayList<Object> arr = new ArrayList<>();

		arr.add(10);
		arr.add("Swayam"); // this is how we create ArrayList
		arr.add(10.25f);
		System.out.println(arr);

		arr.add(1, "B"); // We can add Elements with Index
		System.out.println("arr after adding B at index 1: " + arr);
		System.out.println("Element at index 3: " + arr.get(3));

		// a1 is empty

		ArrayList<Object> a1 = new ArrayList<>();
		a1.add(100); // add 100 to a1!
		a1.addAll(arr); // Copy all the elements of a to a1
		System.out.println("Elements in a1 array list: " + a1);

		for (Object itr : a1) {
			System.out.println(itr);
		}
	}
}
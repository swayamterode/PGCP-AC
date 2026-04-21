package session_12.com.example.javaapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BasicOperations {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 56, 78, 11, 13, 4, 76);
		System.out.println(li);
		li.stream().forEach(System.out::println);
		int sum = IntStream.of(1, 2, 3, 4, 5, 6).sum();
		System.out.println("Sum: " + sum);
		int t1 = IntStream.rangeClosed(1, 10).sum();
		System.out.println(t1);
		int t2 = IntStream.range(1, 10).sum();
		System.out.println(t2);
		int total = li.stream().filter(x -> x % 2 == 0).map(x -> x * 2).reduce(0, Integer::sum);
		System.out.println(total);
		li.stream().forEach(System.out::println);
	}
}

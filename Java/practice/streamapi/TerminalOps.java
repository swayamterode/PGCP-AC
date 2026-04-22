package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {
	public static void main(String[] args) {
//		square and print
		List<Integer> list = Arrays.asList(2, 5, 1, 6);
		list.stream().map(x -> x * x).sorted().forEach(System.out::println);

//		Filter and collect names!
		System.out.println("\nFiltert name who's length > 4!\n");
		List<String> l2 = Arrays.asList("Swayam", "Sam", "Sakshi");
		l2.stream().filter(x -> x.length() > 3).collect(Collectors.toList()).forEach(System.out::println);

//		sum values
		List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(l3.stream().map(x -> x + x).reduce(Integer::sum));

		// counting occurrence of chars l
		String sentence = "Loving Coding Loving London";
		List<String> l4 = Arrays.asList(sentence);
		System.out.println(l4);
		long count = sentence.chars().filter(c -> c == 'L' || c == 'l').count();
		System.out.println(count);
		
	}
}

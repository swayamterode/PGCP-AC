package streamapi;

import java.util.*;
import java.util.stream.*;

public class CollectorsDemo {
	public static void main(String[] args) {
//		1.Collecting to a List
		List<String> names = Arrays.asList("A", "Bob", "Akash", "Aaaa");
		List<String> res = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		System.out.println(res);

//		2. Collecting to a Set
		List<Integer> nums = Arrays.asList(1, 1, 1, 1, 2, 2, 4, 5);
		Set<Integer> s1 = nums.stream().collect(Collectors.toSet());
		System.out.println(s1);

//		3. converting to specific collection you can convert to any collection!
		TreeSet<String> t1 = names.stream().collect(Collectors.toCollection(() -> new TreeSet<String>()));
		System.out.println(t1);
//		4. joining
		String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(" ,"));
		System.out.println("Joining with delimiter: " + concatenatedNames);
//		5. Summarizing Data -> generates stats summary(count, sum, min,average, max)
		List<Integer> numbers = Arrays.asList(1, 44, 146, 6);
		IntSummaryStatistics collect1 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
		System.out.println("Average: " + collect1.getAverage());
		System.out.println("Max: " + collect1.getMax());
		System.out.println("Min: " + collect1.getMin());
		System.out.println("Sum: " + collect1.getSum());

		System.out.println(numbers.stream().collect(Collectors.averagingInt(x -> x)));

//		6. Grouping Elements
		List<String> words = Arrays.asList("hello", "world", "java", "streams", "grouping");
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.joining(" ,"))));
		System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting())));

		Map<Object, Long> t11 = words.stream()
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
		System.out.println(t11);

//		Partitioning by
		Map<Boolean, List<String>> map = names.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));
		System.out.println(map);
	}
}

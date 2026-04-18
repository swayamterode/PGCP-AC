import java.util.*;

public class DoubleAndSum {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 7, 4, 11, 13, 24);
		System.out.println("List: " + list);

		int sum = 0;
		for (int i : list) {
			if ((i % 2) == 0) {
				sum += (i * 2);
				i *= 2;
			}
		}
		System.out.println("List: " + list);
		System.out.println("Sum: " + sum);
	}
}

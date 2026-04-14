package session_07;

public class StringMethods {
	public static void main(String[] args) {

		String s1 = "  Hello, World!  ";
		String s2 = "hello, world!";
		String s3 = "Hello, World!";

		System.out.println(s1.trim().equals(s3)); // true (exact match)
		System.out.println(s2.equals(s3)); // false (case differs)
		System.out.println(s2.equalsIgnoreCase(s3)); // true (ignores case)

		System.out.println("Apple".compareTo("Banana")); // negative (A < B)
		System.out.println("Mango".compareTo("Mango")); // 0 (equal)
		System.out.println("Zebra".compareTo("Apple")); // positive (Z > A)
		// Rule: returns (this char - other char) at first difference

		System.out.println(s3.toUpperCase()); // HELLO, WORLD!
		System.out.println(s3.toLowerCase()); // hello, world!

		System.out.println("'" + s1 + "'"); // ' Hello, World! '
		System.out.println("'" + s1.trim() + "'"); // 'Hello, World!'
		// trim() removes leading and trailing spaces only

		// ── toCharArray
		char[] chars = "Java".toCharArray();
		for (char c : chars) {
			System.out.print(c + " "); // J a v a
		}
		System.out.println();

		String word = "Hello";
		System.out.println(word.charAt(0)); // H (index starts at 0)
		System.out.println(word.charAt(4)); // o
//           word.charAt(10)  // StringIndexOutOfBoundsException

		String url = "https://www.google.com";
		System.out.println(url.startsWith("https")); // true
		System.out.println(url.startsWith("http://")); // false
		System.out.println(url.endsWith(".com")); // true
		System.out.println(url.endsWith(".org")); // false
	}
}
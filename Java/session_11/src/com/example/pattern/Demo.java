package com.example.pattern;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {

        // 1. Split on whitespace
        String str = "Learning Java Programming Language";
        String[] words = str.split("\\s");

        System.out.println("Split by whitespace:");
        for (String word : words) {
            System.out.println(word);
        }

        // 2. Split on comma
        String s1 = "10,20,30";
        String[] numbers = s1.split(",");

        System.out.println("\nSplit by comma:");
        for (String num : numbers) {
            System.out.println(num);
        }

        // 3. Regex tests
        System.out.println("\nRegex Tests:");

        // Case 1: Single character match
        System.out.println("Pattern [abc] with 'a': " +
                Pattern.matches("[abc]", "a")); // true

        System.out.println("Pattern [abc] with 'jav': " +
                Pattern.matches("[abc]", "jav")); // false

        // Case 2: Contains a, b, or c anywhere
        System.out.println("Pattern .*[abc].* with 'jav': " +
                Pattern.matches(".*[abc].*", "jav")); // true

        // Case 3: Only a, b, c (one or more)
        System.out.println("Pattern [abc]+ with 'aba': " +
                Pattern.matches("[abc]+", "aba")); // true

        System.out.println("Pattern [abc]+ with 'jav': " +
                Pattern.matches("[abc]+", "jav")); // false

        // Case 4: Negation (anything except a, b, c)
        System.out.println("Pattern [^abc]+ with 'xyz': " +
                Pattern.matches("[^abc]+", "rxyz")); // true

        System.out.println("Pattern [^abc]+ with 'abx': " +
                Pattern.matches("[^abc]+", "abx")); // false

        // Case 5: Range
        System.out.println("Pattern [a-zA-Z]+ with 'Java': " +
                Pattern.matches("[a-zA-Z]+", "Java")); // true
    }
}
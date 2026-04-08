public class MultiplicationTables {
    public static void main(String[] args) {
        for (int table = 2; table <= 5; table++) {
            System.out.println("--- Table of " + table + " ---");
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            System.out.println();
        }
    }
}

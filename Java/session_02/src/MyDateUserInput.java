import java.util.Scanner;

public class MyDateUserInput {
//	instance variables
	private int dd;
	private int mm;
	private int yy;

	public void intiDate() {
		dd = mm = yy = 1;
	}

//	Accessor
	public void setDate(int date, int month, int year) {
		if (date <= 31 && date >= 1)
			dd = date;
		else
			System.out.print("Invalid Date:\t");

		if (month >= 1 && month <= 12)
			mm = month;
		else
			System.out.print("Invalid Month:\t");
		if (year > 0)
			yy = year;
		else
			System.out.print("Invalid year:\t");
	}

	public void display() {
		System.out.println("Date=[" + dd + "/" + mm + "/" + yy + "]");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int date;
		int month;
		int year;

		System.out.println("Enter the date:");
		date = sc.nextInt();
		System.out.println("Enter the month:");
		month = sc.nextInt();
		System.out.println("Enter the date:");
		year = sc.nextInt();

		MyDateUserInput d; // reference variables
		d = new MyDateUserInput();

//		Set Date mutator called!
		d.setDate(date, month, year);
		d.display();

		sc.close();
	}
}

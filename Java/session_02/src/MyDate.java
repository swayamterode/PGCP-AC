public class MyDate {
//	instance variables
	private int dd;
	private int mm;
	private int yy;

	public void intiDate() {
		dd = mm = yy = 1;
	}

//	Accessor
	public void setDate(int date, int month, int year) {
		if (date < 31 && date > 1)
			dd = date;

		if (month > 1 && month < 12)
			mm = month;
		if (year > 0)
			yy = year;
	}

	public void display() {
		System.out.println("Date=[" + dd + "/" + mm + "/" + yy + "]");
	}

	public static void main(String[] args) {
		MyDate d; // reference variables
		d = new MyDate();
		System.out.println("inti Date: " + d.dd);
		d.display();

//		after initDate!
		d.intiDate();
		d.display();

//		Set Date mutator called!
		d.setDate(1, 12, 2026);
		d.display();
	}
}

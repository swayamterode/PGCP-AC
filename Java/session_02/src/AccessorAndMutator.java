public class AccessorAndMutator {
	int dd;
	int mm;
	int yy;

//	accessor
	public int getDate() {
		return dd;
	}

	public int getMonth() {
		return mm;
	}

	public int getyear() {
		return yy;
	}

//	mutator

	public int setDate(int day) {
		dd = day;
		return dd;
	}

	public int setMonth(int month) {
		mm = month;
		return mm;
	}

	public int setYear(int year) {
		yy = year;
		return yy;
	}

	public static void main(String[] args) {
		AccessorAndMutator obj = new AccessorAndMutator();
		int day = obj.setDate(1);
		int month = obj.setMonth(12);
		int year = obj.setYear(2026);
		System.out.println(day + "/" + month + "/" + year);
	}
}

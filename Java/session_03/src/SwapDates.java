public class SwapDates {
	private int mm;
	private int dd;
	private int yy;

	public SwapDates() {
	}

	public SwapDates(int mm, int dd, int yy) {
		this.mm = mm;
		this.dd = dd;
		this.yy = yy;
	}

	public String toString() {
		return "Swap Dates [mm=" + mm + ", dd=" + dd + ", yy=" + yy + "]";
	}

	public static void swapDates(SwapDates[] d) {
		System.out.println("Inside swap dates!");

		SwapDates temp;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;
	}

	public static void main(String[] args) {
		SwapDates d[] = new SwapDates[2];

		SwapDates d1 = new SwapDates(9, 2, 2026);
		SwapDates d2 = new SwapDates(5, 6, 2027);
		d[0] = d1;
		d[1] = d2;

		System.out.println("Before Swapping!!");

		System.out.println("d1= " + d[0]);
		System.out.println("d2= " + d[1]);

		System.out.println("\nAfter Swapping!\n");
		System.out.println("d1= " + d[0]);
		System.out.println("d2= " + d[1]);

	}
}
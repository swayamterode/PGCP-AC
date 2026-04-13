package classroom.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatAndParsing {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();

		System.out.println("Default : " + d);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("MM/dd/yyyy           : " + sdf1.format(d));

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("dd-MM-yyyy           : " + sdf2.format(d));

		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("yyyy-MM-dd           : " + sdf3.format(d));

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd MMM yyyy");
		System.out.println("dd MMM yyyy          : " + sdf4.format(d));

		SimpleDateFormat sdf5 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
		System.out.println("EEEE, dd MMMM yyyy   : " + sdf5.format(d));

		SimpleDateFormat sdf6 = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("hh:mm:ss a           : " + sdf6.format(d));

		SimpleDateFormat sdf7 = new SimpleDateFormat("HH:mm:ss");
		System.out.println("HH:mm:ss             : " + sdf7.format(d));

		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("yyyy-MM-dd HH:mm:ss  : " + sdf8.format(d));

		SimpleDateFormat sdf9 = new SimpleDateFormat("dd/MM/yy");
		System.out.println("dd/MM/yy             : " + sdf9.format(d));

		SimpleDateFormat sdf10 = new SimpleDateFormat("E, MMM dd yyyy");
		System.out.println("E, MMM dd yyyy       : " + sdf10.format(d));

		SimpleDateFormat sdf11 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		System.out.println("ISO 8601             : " + sdf11.format(d));

		SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm a, dd MMM yyyy");
		System.out.println("hh:mm a, dd MMM yyyy : " + sdf12.format(d));
	}
}
package practice04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import
public class Main {
	public static void main(String[] args) {
//		long now = System.currentTimeMillis();
		Date now = new Date();
		System.out.println();

		Calendar c = Calendar.getInstance();
		c.set(2021, 9, 1, 9, 00 );
		c.set(Calendar.MONTH, 8);
		Date d = c.getTime();
		System.out.println(d);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		System.out.println(future);
		 SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		    System.out.println(f.format(future));
	}
}

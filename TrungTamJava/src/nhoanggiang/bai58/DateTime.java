package nhoanggiang.bai58;

import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		Date now2 = new Date();
		System.out.println(now2);
		if (now.equals(now2)){
			System.out.println("bang nhau");
		}
		else{
			System.out.println("khong bang nhau");
		}
		System.out.println(now.getTime());
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.HOUR, -1);
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.getTime());
	}

}

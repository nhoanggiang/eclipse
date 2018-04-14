package nhoanggiang.bai58;

import java.util.Calendar;
import java.util.Date;

public class NgayGio {
	public static void main(String[] args) {
		Date now1 = new Date();
		System.out.println(now1);
		Date now2 = new Date();
		if (now1.equals(now2)){
			System.out.println("Bang nhau");
		}
		else{
			System.out.println("Khong bang nhau");
		}
		System.out.println(now1.getTime());
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.HOUR, -1);
		cal.add(Calendar.DATE, -2);
		System.out.println(cal.getTime());
	}

}

package nhoanggiang.bai49;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class Main {

	public static void main(String[] args) {
		long x=10;
		int i = (int)x;
		Worker w = new Worker();
		Employee e = new Worker();
		Person p = new Worker();
		Object o = new Worker();
		w.luong();
		//e.luong();
		Worker w1 = (Worker)e;
		w1.luong();
		((Worker)p).luong();
		((Employee)o).toString();
		
		Person p1 = new Person();
		if (p1 instanceof Worker){
			((Worker)p1).luong();		
		}
		else{
			System.out.println("Khong phai Worker");
		}
		Person p2 = new Worker();
		if (p2 instanceof Worker){
			((Worker)p2).luong();
		}
		else{
			System.out.println("Khong phai Worker");
		}
		
		if (p2 instanceof Employee){
			System.out.println("Employee");
		}

		
		
	}

}

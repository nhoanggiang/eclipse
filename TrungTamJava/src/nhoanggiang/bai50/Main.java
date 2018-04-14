package nhoanggiang.bai50;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		if(p instanceof Worker){
			((Worker)p).luong(); 
		}
		else{
			System.out.println("Khong phai Worker");
		}
		Person p2 = new Worker();
		if (p2 instanceof Worker){
			System.out.println("Worker");
		}
		if (p2 instanceof Employee){
			System.out.println("Employee");
		}
	}

}

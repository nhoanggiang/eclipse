package nhoanggiang.bai62;

public class Employee {
	public void luong(){
		class Worker{
			private String ten;
			public void luong(){
				System.out.println("Luong cong nhan");
			}
		}
		Worker w = new Worker();
		w.luong();
	}
	public static void main(String[] args) {
		//Worker w1 = new Worker();
		Employee em = new Employee();
		em.luong();
	}
}

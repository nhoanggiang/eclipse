package nhoanggiang.bai47;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Person p = new Employee();
		
		emp.setTen("Giang");
		emp.setLuong(3.5);
		p.setTen("Linh");
		//p.setLuong("2.3");
		emp.thongTin();
		p.thongTin();
		
		Person person = new Person();
		person.thongTin();

	}

}

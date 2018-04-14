package nhoanggiang.bai47;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee();
		Person p = new Employee();
		em.setTen("A");
		em.setLuong(12000000);
		
		p.setTen("B");
		//p.setLuong();
		em.thongTin();
		p.thongTin();
		
		Person p2 = new Person();
		p2.thongTin();
	}

}

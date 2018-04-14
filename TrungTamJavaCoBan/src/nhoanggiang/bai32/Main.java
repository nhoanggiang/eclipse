package nhoanggiang.bai32;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setTen("Nguyen Hoang Giang");
		p1.setTuoi(26);
		Person p2 = new Person();
		p2.setTen("Pham Viet Linh");
		p2.setTuoi(23);
		
		System.out.println(p1.getTen() + "\t" + p1.getTuoi());
		System.out.println(p2.getTen() + "\t\t" + p2.getTuoi());
	}

}

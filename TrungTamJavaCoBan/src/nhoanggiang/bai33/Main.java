package nhoanggiang.bai33;

import nhoanggiang.bai36.Person;

public class Main {

	public static void main(String[] args) {
		Book book1= new Book();
		book1.setTen("Phia sau mot co gai");
		book1.setMoTa("Nguyen Nhat Anh");
		book1.setGia(120000);
		
		Book book2 = new Book("Dac nhan tam", "Nguen Hoang Giang", 100000);
		System.out.println(book2.getTen() + "\t" + book2.getMoTa() + "\t" + book2.getGia());
		
		Book book3 = new Book("Phia dong vuon dia dang", "Han Quoc");
		System.out.println(book3.getGia());
		Person p = new Person();
		p.diaChi = "hoanggiang";

				
	}
	

}

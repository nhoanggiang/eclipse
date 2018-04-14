package nhoanggiang.bai42;

public class Employee extends Person{
	String ten;
	
	public void thongTin(){
		this.ten = "B";
		System.out.println("Thong tin class con la: " + this.ten);
		super.thongTin();
		super.ten = "Cha";
		this.ten = "Con";
		System.out.println("Thong tin class con la: " + this.ten);
		System.out.println("Thong tin class cha la: " + super.ten);
		
	}
}

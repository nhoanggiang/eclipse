package nhoanggiang.edu.vn;

public class Employee extends Person{
	String ten;
	
	public void thongTin(){
		this.ten = "Linh";
		System.out.println("Ten cua class con la: " + this.ten);
		
		super.thongTin();
		super.ten = "Nguen Hoang Giang";
		ten = "Pham Viet Linh";
		
		System.out.println("Ten cua class con la: " + this.ten);
		
		super.thongTin();
	}
	

}

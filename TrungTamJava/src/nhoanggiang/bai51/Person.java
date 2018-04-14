package nhoanggiang.bai51;

public class Person {
	private String ten;
	private String ho;
	
	public void setHoTen(String ho, String ten){
		this.ho = ho;
		this.ten = ten;
	}
	public String getFullName(){
		return this.ho + " " + this.ten;
	}

}

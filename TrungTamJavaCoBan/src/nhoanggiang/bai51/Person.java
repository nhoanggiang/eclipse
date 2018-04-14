package nhoanggiang.bai51;

public class Person {
	private String ten;
	private String ho;
	
	public void setHoTen(String ten, String ho){
		this.ten = ten;
		this.ho = ho;
		
	}
	public String getHoTen(){
		return this.ho + " " + this.ten;
	}

}

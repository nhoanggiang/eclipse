package nhoanggiang.bai33;

public class Book {
	String ten;
	String moTa;
	double gia;
	
	//Constructor
	public Book(){
		
	}
	public Book(String ten, String moTa){
		this.ten = ten;
		this.moTa = moTa;
	}
	public Book(String ten, String moTa, double gia){
		this.ten = ten;
		this.moTa = moTa;
		this.gia = gia;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	
}

package nhoanggiang.model;

import java.util.Vector;

public class NhomKhachHang {
	private String ma;
	private String ten;
	private Vector<KhachHang> KhachHangs;
	
	public void themKhachHang(KhachHang kh){
		this.KhachHangs.add(kh);
		kh.setNhom(this);
	}
	
	public NhomKhachHang() {
		super();
		this.KhachHangs = new Vector<KhachHang>();
	}
	public NhomKhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.KhachHangs = new Vector<KhachHang>();
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Vector<KhachHang> getKhachHangs() {
		return KhachHangs;
	}
	public void setKhachHangs(Vector<KhachHang> khachHangs) {
		KhachHangs = khachHangs;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ten;
	}
	
}

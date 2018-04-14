package nhoanggiang.bai41;

public class Animal {
	private String ten;
	public int tuoi;
	protected String noiSinhSong;
	String diaChi;
	
	
	
	public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public int getTuoi() {
		return tuoi;
	}



	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}



	public String getNoiSinhSong() {
		return noiSinhSong;
	}



	public void setNoiSinhSong(String noiSinhSong) {
		this.noiSinhSong = noiSinhSong;
	}



	public String getDiaChi() {
		return diaChi;
	}



	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}



	public void thongTin(){
		this.ten = "Giang";
		this.tuoi = 23;
		this.noiSinhSong = "Ha Noi";
		this.diaChi = "Dak Lak";
		
		anUong();
		diLai();
		ngu();
		sanMoi();
	}
	
	
	private void anUong(){
		
	}
	void diLai(){
		
	}
	protected void ngu(){
		
	}
	public void sanMoi(){
		
	}


}

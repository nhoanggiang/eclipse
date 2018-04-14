package nhoanggiang.bai40;

public class CongNhan extends NhanVien{
	private int ngayCong;

	public int getNgayCong() {
		return ngayCong;
	}

	public void setNgayCong(int ngayCong) {
		this.ngayCong = ngayCong;
	}
	
	public int tongLuong(){
		return this.ngayCong*500000;
	}

}

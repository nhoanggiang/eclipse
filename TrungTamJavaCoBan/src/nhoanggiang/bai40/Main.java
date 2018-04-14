package nhoanggiang.bai40;

public class Main {

	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		nv.setTen("Giang");
		nv.setDiaChi("Ho Chi Minh");
		nv.setLuong(9.5);
		
		nv.mucLuong();
		System.out.println(nv.getTen() + "\t" + nv.getDiaChi() + "\t" + nv.getLuong());
		
		CongNhan cn = new CongNhan();
		cn.setTen("Pham Viet Linh");
		cn.setDiaChi("Ha Noi");
		cn.setNgayCong(25);
		System.out.println("Ten: " + cn.getTen());
		System.out.println("Dia chi: " + cn.getDiaChi());
		System.out.println("Tong luong: " + cn.tongLuong());
	}

}

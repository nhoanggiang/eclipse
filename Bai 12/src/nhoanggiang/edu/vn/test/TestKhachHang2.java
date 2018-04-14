package nhoanggiang.edu.vn.test;

import java.util.ArrayList;

import nhoanggiang.edu.vn.io.SerializeFileFactory;
import nhoanggiang.edu.vn.io.TestFileFactory;
import nhoanggiang.edu.vn.model.KhachHang;

public class TestKhachHang2 {
	public static void testLuuFile(){
		ArrayList<KhachHang>dsKH =  new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Nguyễn Hoàng Giang"));
		dsKH.add(new KhachHang("KH02", "Phạm Việt Linh"));
		dsKH.add(new KhachHang("KH03", "Nguyễn Huy Hoàng"));
		dsKH.add(new KhachHang("KH04", "Nguyễn Thị Thu Hà"));
		boolean kt = SerializeFileFactory.luuFile(dsKH, "E:\\dulieu2.txt");
		if (kt == true){
			System.out.println("Da luu file thanh cong!");
		}
		else{
			System.out.println("Luu file that bai!");
		}
		
	}
	public static void main(String[] args){
		testLuuFile();
		ArrayList<KhachHang>dsKH = SerializeFileFactory.docFile("E:\\dulieu2.txt");
		System.out.println("Danh sach khac hang nap vao may tinh la");
		System.out.println("Mã\tTên");
		for (KhachHang ds: dsKH){
			System.out.println(ds);
		}
		
		
	}

}

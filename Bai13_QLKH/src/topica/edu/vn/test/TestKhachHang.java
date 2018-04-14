package topica.edu.vn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import topica.edu.vn.io.SerializeFileFactory;
import topica.edu.vn.model.KhachHang;

public class TestKhachHang {
	static ArrayList<KhachHang>dsKH =  new ArrayList<KhachHang>();
	public static void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Nhap khach hang");
		System.out.println("2. Xuat khach hang");
		System.out.println("3. Tim kiem khach hang");
		System.out.println("4. Sap xep khach hang");
		System.out.println("5. Luu khach hang");
		System.out.println("6. Doc khach hang");
		System.out.println("7. Thong ke khach hang theo nha mang");
		System.out.println("8. Thoat chuong trinh");
		int chon =0;
		System.out.println("Moi ban chon chuc nang [1...8]");
		chon = sc.nextInt();
		switch (chon){
		case 1:
			xuLyNhap();
			break;
		case 2:
			xuLyXuat();
			break;
		case 3: 
			xuLyTim();
			break;
		case 4:
			suLySapXep();
			break;
		case 5:
			xuLyLuu();
			break;
		case 6:
			xuLyDoc();
			break;
		case 7:
			xuLyThongKe();
			break;
		case 8:
			xuLythoat();
			break;
		default:
			System.out.println("Ban chon sai. Vui long chon lai!");
			break;
		}
	}

	private static void xuLythoat() {
		System.out.println("Cam on ban da dung phan mem!");
		System.exit(0);
		// TODO Auto-generated method stub
		
	}

	private static void xuLyThongKe() {
		// TODO Auto-generated method stub
		
	}

	private static void xuLyDoc() {
		dsKH = SerializeFileFactory.docFile("E:\\dulieukhachhang.db");
		System.out.println("Da doc file thanh cong");
		
	}

	private static void xuLyLuu() {
		boolean kt = SerializeFileFactory.luuFile(dsKH, "E:\\dulieukhachhang.db");
		if (kt==true){
			System.out.println("Da luu file thanh cong");
				
		}
		else{
			System.out.println("Luu file that bai");
		}
		
	}

	private static void suLySapXep() {
		Collections.sort(dsKH);
		System.out.println("Da sap xep theo so dien thoai!");
		
	}

	private static void xuLyTim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap dau so can tim: ");
		String tim = sc.nextLine();
		System.out.println("===========================================");
		System.out.println("Nhung khach hang co dau so "+tim+": ");
		System.out.println("Ma\tTen\tPhone");
		for(KhachHang kh: dsKH){
			if (kh.getPhone().startsWith(tim)){
				System.out.println(kh);
			}
		}
		System.out.println("===========================================");

		
	}

	private static void xuLyXuat() {
		System.out.println("=================================================");
		System.out.println("Ma\tTen\tPhone");
		for (KhachHang kh: dsKH){
			System.out.println(kh);
		}
		System.out.println("=================================================");
		
	}

	private static void xuLyNhap() {
		KhachHang kh = new KhachHang();
		System.out.println("Moi ban nhap ma");
		int ma =  new Scanner(System.in).nextInt();
		System.out.println("Moi ban nhap ten");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Moi ban nhap so dien thoai");
		String phone = new Scanner(System.in).nextLine(); 
		kh.setMa(ma);
		kh.setTen(ten);
		kh.setPhone(phone);
		dsKH.add(kh);
		
	}

	public static void main(String[] args) {
		while (true){
			menu();
		}
		// TODO Auto-generated method stub

	}

}

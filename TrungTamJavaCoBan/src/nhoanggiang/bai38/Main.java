package nhoanggiang.bai38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] mang = new int[5];
		NhanVien[] nv = new NhanVien[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap vao gia tri: ");
		for (int i = 0; i < nv.length; i++){
			String ten = sc.nextLine();
			String diaChi = sc.nextLine();
			int tuoi = sc.nextInt();
			
			nv[i] = new NhanVien(ten, diaChi, tuoi);
			
			//Xoa bo nho dem
			sc.nextLine();
			
		}
		for (NhanVien x : nv){
			System.out.println(x.getTen() + "\t" + x.getDiaChi() + "\t" + x.getTuoi());
		}
	}

}

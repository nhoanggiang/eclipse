package nhoanggiang.bai14;

import java.util.Scanner;

public class NhapDuLieu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap gia tri: ");
		int x = sc.nextInt();
		System.out.println("Gia tri cua x la: " + x);
		
		System.out.println("Vui long nhap gia tri cua y va Z: ");
		long y = sc.nextLong();
		double z = sc.nextDouble();
		double tong = y+z;
		System.out.println("Tong cua 2 so y va z la: " + tong);
		boolean b = sc.nextBoolean();
		short s = sc.nextShort();
		String str = sc.nextLine();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(str);
	}

}

package nhoanggiang.bai18;

import java.util.Scanner;

public class ToanTu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so x: ");
		int x = sc.nextInt();
		int tong = (x>5)? (x+1): (x-1);
		System.out.println(tong);
		String s = (x>5)? "x>5":"x<5";
		System.out.println(s);
	}

}


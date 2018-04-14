package nhoanggiang.bai15;

import java.util.Scanner;

public class CauDieuKienIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap gia tri cua x: ");
		int x = sc.nextInt();
		if (x>5){
			System.out.println("Gia tri cua x lon hon 5");
		}
		if (x==5){
			System.out.println("Gia tri cua x bang 5");
		}
		if (x!=5){
			System.out.println("Gia tri cua x khac 5");
		}
		if (x>=10){
			System.out.println("Gia tri cua x lon hon 10");
		}
		System.out.println("Ket thuc");
	}

}

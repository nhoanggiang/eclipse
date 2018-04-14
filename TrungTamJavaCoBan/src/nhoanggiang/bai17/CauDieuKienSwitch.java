package nhoanggiang.bai17;

import java.util.Scanner;

public class CauDieuKienSwitch {

	public static void main(String[] args) {
		System.out.print("Vui long nhap gia tri cua x: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x){
		case 1: {
			System.out.print("Gia tri cua x bang 1 ");
			break;
		}
		case 2: {
			System.out.println("Gia tri cua x bang 2");
			break;
		}
		case 3: {
			System.out.println("Gia tri cua x bang 3");
			break;
		}
		case 4: {
			System.out.println("Gia tri cua x bang 4");
			break;
		}
		case 5: {
			System.out.println("Gia tri cua x bang 5");
			break;
		}
		default: {
			System.out.println("Gia tri cua x nam ngoai vung gioi han ");
		}
		
		}
	}

}

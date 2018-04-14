package nhoanggiang.selectionsort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SelectionSort ma = new SelectionSort();
		int[] array;
		array = ma.nhapMang(5);
		System.out.println("Mang truoc khi sap xep: ");
		ma.xuatMang(array);
		ma.sapXep(array);
		System.out.println("Mang sau khi sap xep: ");
		ma.xuatMang(array);

	}

}

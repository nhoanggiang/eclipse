package nhoanggiang.selectionsort;

import java.util.Scanner;

import sun.security.util.Length;

public class SelectionSort {
	public int n;
	public int[] a = new int[n];
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	public SelectionSort(int n, int[] a) {
		super();
		this.n = n;
		this.a = a;
	}
	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	static int[] nhapMang(int n){
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap so phan tu cua mang: ");
		n = sc.nextInt();
		int[] a = new int[n];
		//int[] a = new int[n];
		for (int i=0; i<n; i++){
			System.out.print("Nhap gia tri a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		return a;

	}
	public void swap(int x, int y){
		int tam = x;
		x = y;
		y = tam;
	}
	
	public void sapXep(int[] a){

		for (int i=0; i<a.length-1; i++){
			int min = i;
			for (int j=i+1; j<a.length; j++){
				if (a[j] < a[min]){
					min = j;
				}
			}
			int tam = a[min];
			a[min] = a[i];
			a[i] = tam;
			
		}
	}
	public void xuatMang(int[] a){
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
}

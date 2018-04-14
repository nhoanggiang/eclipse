package nhoanggiang.bai45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vui long nhap vao thong tin cua 3 nhan vien: ");
		for(int i=0; i<emps.length; i++){
			System.out.println("Nhan vien thu "+(i+1));
			System.out.println("Nhap ten duong: ");
			String tenDuong = sc.nextLine();
			System.out.println("Nhap ten nhan vien: ");
			String ten = sc.nextLine();
			System.out.println("Nhap so nam kinh nghiem: ");
			int soNamKN = sc.nextInt();
			Address add = new Address(tenDuong);
			Employee emp = new Employee(ten, soNamKN);
			emp.setAddress(add);
			emps[i] = emp;
			sc.nextLine();
		}	
		System.out.println("Hien thi thong tin nhan vien: ");
		System.out.println("Ten duong\tTen\tLuong");
		for(Employee emp: emps){
			System.out.println(emp.getTen()+"\t"+emp.getAddress().getTenDuong()+"\t"+emp.luong());
		}

	}

}

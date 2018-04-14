package nhoanggiang.bai45;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap thong tin cua 3 thanh vien: ");
		for (int i = 0; i < emps.length; i++){
			String ten = sc.nextLine();
			String tenDuong = sc.nextLine();
			int soNamKN = sc.nextInt();
			Address add = new Address(tenDuong);
			Employee emp = new Employee(ten, soNamKN);
			emp.setAddress(add);
			emps[i] = emp;
			// Xoa bo nho dem
			sc.nextLine();
		}
		System.out.println("Thong tin nhan vien nhap vao: ");
		for(Employee emp : emps){
			System.out.println(emp.getTen() + "\t" + emp.getAddress().getTenDuong() + "\t" + emp.luong() );
		}
	}

}

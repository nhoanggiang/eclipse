package nhoanggiang.bai55;

import nhoanggiang.bai54.AnimalService;

public class Main {

	public static void main(String[] args) {
		EmployeeService em = new EmployeeServiceImpl();
		EmployeeServiceImpl em2 = new EmployeeServiceImpl();
		AnimalService an = new EmployeeServiceImpl();
		em.luong();
		an.them();
		em2.luong();
		em2.sua();
	}

}

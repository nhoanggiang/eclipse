package nhoanggiang.bai55;

import nhoanggiang.bai54.AnimalService;

public class Main {

	public static void main(String[] args) {
		EmployeeServiceimpl emp = new EmployeeServiceimpl();
		EmployeeService emp2 = new EmployeeServiceimpl();
		//EmployeeService emp3 = new EmployeeService();
		AnimalService an = new EmployeeServiceimpl();
		emp.luong();
		emp2.luong();
	}

}

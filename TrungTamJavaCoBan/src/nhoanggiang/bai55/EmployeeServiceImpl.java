package nhoanggiang.bai55;

import nhoanggiang.bai54.AnimalService;

public class EmployeeServiceImpl implements EmployeeService, AnimalService{

	@Override
	public void luong() {
		System.out.println("Luong");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void them() {
		System.out.println("Them");
	}

	@Override
	public void sua() {
		System.out.println("Sua");
	}

	@Override
	public void xoa() {
		System.out.println("Xoa");
	}

}

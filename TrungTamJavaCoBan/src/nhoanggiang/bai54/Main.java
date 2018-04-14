package nhoanggiang.bai54;

public class Main {
	public static void main(String[] args) {
		AnimalServiceImpl an = new AnimalServiceImpl();
		AnimalService an2 = new AnimalServiceImpl();
		
		an.them();
		an.sua();
		an.xoa();
		an2.them();
		an2.sua();
		an2.xoa();
	}

}

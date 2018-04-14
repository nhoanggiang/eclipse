package nhoanggiang.bai59;

public class Person {
	public void xinChao(){
		Kid kid = new Kid();
		kid.hello();
	}

}
class Kid{
	private int tuoi;
	public void hello(){
		System.out.println("Xin chao");
	}
	
}

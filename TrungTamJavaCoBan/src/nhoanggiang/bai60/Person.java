package nhoanggiang.bai60;

public class Person {
	// Iner static class
	public static class Kid{
		private int tuoi;
		public void hello(){
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		Person.Kid kid = new Person.Kid();
		kid.hello();
	}

}

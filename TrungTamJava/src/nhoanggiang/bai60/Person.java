package nhoanggiang.bai60;

public class Person {
	//Inner static class
	public static class Kid{
		private int tuoi;
		public void hello(){
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		Person.Kid kid = new Person.Kid();
		kid.hello();
	}

}

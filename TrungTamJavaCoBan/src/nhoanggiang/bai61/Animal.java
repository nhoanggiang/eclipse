package nhoanggiang.bai61;

public class Animal {
	public class Dog{
		private int ten;
		public void hello(){
			System.out.println("Hello Viet Nam!");
		}
		
		
	}
	public class Husky extends Dog{
		
	}
	public static void main(String[] args) {
		Animal an = new Animal();
		Animal.Dog d = an.new Dog();
		d.hello();
	}

}

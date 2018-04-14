package nhoanggiang.bai61;

public class Animal {
	//Inner class
	public class Dog{
		private String ten;
		public void hello(){
			System.out.println("Cong hoa xa hoi chu nghia Viet Nam");
		}
		
	}
	public static void main(String[] args) {
		Animal an = new Animal();
		Animal.Dog dog = an.new Dog();
		dog.hello();
	}
}

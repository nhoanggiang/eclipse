package nhoanggiang.bai44;

public class SubClass extends SuperClass{
	@Override
	public int tong2So(int a, int b){
		System.out.println(super.tong2So(a, b));
		return (a+b)*2;
	}
	
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.tong2So(2, 3));
		
		SuperClass sup = new SuperClass();
		System.out.println(sup.tong2So(2, 3));
	}

}

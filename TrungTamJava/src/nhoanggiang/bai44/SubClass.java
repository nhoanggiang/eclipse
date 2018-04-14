package nhoanggiang.bai44;

public class SubClass extends SuperClass{
	@Override
	public int tong2So(int a, int b) {
		return 12+11;
		
	}
	@Override
	public float tong2So(float a, float b) {
		System.out.println(super.tong2So(a, b));
		return a+b+10;

	}
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.tong2So(1.2f, 2.3f));
		
//		SuperClass sup = new SuperClass();
//		System.out.println(sup.tong2So(1.2f, 2.3f));
	}

}

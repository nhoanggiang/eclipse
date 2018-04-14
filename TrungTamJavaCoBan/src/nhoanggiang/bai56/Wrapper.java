package nhoanggiang.bai56;

public class Wrapper {
	public static void main(String[] args) {
		int x = 10;
		Integer y = new Integer(20);
		int z = x + y; // Autoboxing, cu the la unboxing tuc la chuyen doi tu Integer ve int
		System.out.println(z);
		int z1 = Integer.valueOf("12");
		int z2 = Integer.parseInt("21");
		System.out.println(z1);
		System.out.println(z2);
		
		Integer k =10;   // Boxing, tu dong chuyen kieu int thanh kieu Integer
		k = new Integer(10);
		int x1 = 10;
		int x2 = 10;
		Integer x3 = 10;
		System.out.println(x1==x2);
		System.out.println(x2!=x3);
		
		Integer k1 = new Integer(10);
		Integer k2 = new Integer(10);
		System.out.println(k1==k2);
		System.out.println(k1);
		int k3 = 10;
		System.out.println(k1==k3);
		System.out.println(k1.equals(k2));
		
	}

}

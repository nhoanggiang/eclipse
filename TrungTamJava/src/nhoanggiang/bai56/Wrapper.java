package nhoanggiang.bai56;

public class Wrapper {
	public static void main(String[] args) {
		int x = 10;
		Integer y = new Integer(12);
		int z = x+y;  //autoboxing, cu the la unboxing, tuc la chuyen doi tu Integer ve int
		System.out.println(z);
		int z1 = Integer.valueOf("45");
		int z2 = Integer.parseInt("45");
		Long.valueOf("34");
		Boolean.valueOf("true");
		
		Integer k = 10;  //Boxing, tu dong chuyen doi tu int thanh Integer
		k = new Integer(10);
		int x1 = 10;
		int x2 = 10;
		Integer x3 = 10;
		System.out.println(x1==x2);
		System.out.println(x1==x3);
		
		Integer k1 = new Integer(10);
		Integer k2 = new Integer(10);
		int k3 =10;
		System.out.println(k1==k2);
		System.out.println(k1==k3);
		System.out.println(k1.equals(k2));
		
	}

}

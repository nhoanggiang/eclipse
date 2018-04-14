package nhoanggiang.bai8;

public class ToanTu {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int tong = x+y;
		int hieu = x-y;
		int tich = x*y;
		float thuong = (float)x/y;
		int du = y%x;
		System.out.println("tong = "+tong);
		System.out.println("hieu = "+hieu);
		System.out.println("hieu = "+hieu);
		System.out.println("thuong = "+thuong);
		System.out.println("du = "+du);
		
		//So thuc
		double a = 2.53;
		float b = 2.1f;
		float tongF = (float) (a+b);
		System.out.println("tongF = " + tongF);
		
		//Phep gan nhanh
		int t1 = 12;
		int t2 = 13;
		int t3 = 4;
		System.out.println(t1+=5);
		System.out.println(t2-=5);
		System.out.println(t3++);
		
	}

}

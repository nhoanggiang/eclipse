package nhoanggiang.bai44;

public class SuperClass {
	public int tong2So(int a, int b){
		return a+b;
	}
	public long tong2So(int a, long b){
		return a+b;
	}
	public float tong2So(float a, float b){
		return a+b;
	
	}
	public float tong2So(float a){
		return a+10;
	}
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.tong2So(2.4f);
		sup.tong2So(1.2f, 3.2f);
		
	}
}

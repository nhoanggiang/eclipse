package nhoanggiang.bai34;

public class HinhChuNhat {
	static int count = 0;
	
	public static int chuVi(int chieuDai, int chieuRong){
		return (chieuDai+chieuRong)*2;
	}
	public static void main(String[] args) {
		System.out.println(HinhChuNhat.count);
		HinhChuNhat.count +=1;
		System.out.println(HinhChuNhat.count);
		System.out.println(HinhChuNhat.chuVi(12, 5));
		
		HinhChuNhat hinh1 = new HinhChuNhat();
		HinhChuNhat hinh2 = new HinhChuNhat();
		
		System.out.println(hinh1.count);
		hinh2.count = 10;
		System.out.println(HinhChuNhat.count);
		System.out.println(hinh2.count);
		System.out.println(hinh1.count);
		System.out.println(hinh1.chuVi(13, 4));
	}
}

package nhoanggiang.bai9;

public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hienThi();
		
		int x = 15;
		int y = 3;
		int hieu = hieuHaiSo(x, y);
		System.out.println(hieu);
		}
	public static int tongHaiSo(){
		int x = 10;
		int y = 15;
		return x+y;
	}
	// Ham 2 doi so truyen vao
	public static int hieuHaiSo(int x, int y){
		int hieu = x-y;
		return hieu;
	}
	public static double soPi(){
		return 3.14;
	}
	// Ham khong co gia tri tra ve
	public static void hienThi(){
		System.out.println(tongHaiSo());
		System.out.println(hieuHaiSo(13, 4));
		System.out.println(soPi());
	}

}

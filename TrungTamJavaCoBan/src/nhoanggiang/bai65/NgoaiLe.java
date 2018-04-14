package nhoanggiang.bai65;

public class NgoaiLe {
	public static void main(String[] args) {
		int[] mang = {1,2};
		try{
			System.out.println(mang[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Loi1");
		}
		catch(Exception e){
			System.out.println("Loi " + e);
		}
		
		System.out.println("Ket thuc chuong trinh");
	}

}

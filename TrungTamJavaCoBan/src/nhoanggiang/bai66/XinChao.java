package nhoanggiang.bai66;

public class XinChao {

	public static void main(String[] args) {
		int[] mang = {1,2};
		try{
			System.out.println(mang[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Loi 1");
		}
		catch(Exception e){
			System.out.println("Loi " + e);
		}
		finally {
			System.out.println("Finally");
		}

		System.out.println("Ket thuc chuong trinh");
	}

}

package nhoanggiang.bai68;

public class Hello {

	public static void main(String[] args){
		try {
			chia2So(4, 0);
		} catch (MyException e) {
			System.out.println(e.getLoi());
		}
		finally {
			System.out.println("Luon luon thuc hien");
		}
		System.out.println("Ket thuc chuong trinh");

	}
	public static void chia2So(int a, int b){
		try{
			int kq = a/b;
			System.out.println(kq);
		}
		catch(Exception e){
			throw new MyException("Loi chia so 0");
		}

	}

}

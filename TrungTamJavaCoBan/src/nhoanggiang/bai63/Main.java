package nhoanggiang.bai63;

public class Main {
	public static void main(String[] args) {
		PersonService p = new PersonService() {
			
			@Override
			public void hello() {
				System.out.println("Hello!");
			}
		};
		p.hello();
		
		XinChao x = new XinChao() {
			@Override
			public void xinChao() {
				// TODO Auto-generated method stub
				super.xinChao();
			}
			
		};
		x.xinChao();
	}
	

}
abstract class XinChao{
	public void xinChao(){
		System.out.println("Xin chao!");
	}
}

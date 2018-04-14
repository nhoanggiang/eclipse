package nhoanggiang.baii49;

public class Main {

	public static void main(String[] args) {
		long x = 10;
		int i = (int)x;
		long a = (long)i;
		Worker wk = new Worker();
		Employee em = new Worker();
		Person p = new Worker();
		Object obj = new Worker();
		
		wk.luong();
		em.luong();
		Worker k1 = (Worker)em;
		k1.luong();
		((Worker)p).luong();
	}

}

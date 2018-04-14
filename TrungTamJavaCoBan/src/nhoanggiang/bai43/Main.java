package nhoanggiang.bai43;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setTen("A");
		em.setDiaChi(null);
		DiaChi dc = new DiaChi();
		dc.setTenDuong("Ha Noi");
		em.setDiaChi(dc);
		
		System.out.println(em.getTen());
		System.out.println(em.getDiaChi().getTenDuong());
	}

}

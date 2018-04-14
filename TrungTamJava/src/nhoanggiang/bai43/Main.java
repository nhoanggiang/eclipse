package nhoanggiang.bai43;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee();
		em.setTen("Giang");
		
		em.setDiaChi(null);
		DiaChi diaChi = new DiaChi();
		diaChi.setTenDuong("Ha Noi");
		em.setDiaChi(diaChi);
		
		System.out.println(em.getTen());
		System.out.println(em.getDiaChi().getTenDuong());
		


	}

}

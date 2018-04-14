package nhoanggiang.democontrojava;

public class Demo {
	public static void main(String[] args) {
		MonHoc mh1 = new MonHoc();
		mh1.ten = "Toan";
		mh1.soTinChi = 5;
		
		MonHoc mh2 = mh1;
		System.out.println("mh1.ten = " + mh1.ten);
		System.out.println("mh1.soTinChi = " + mh1.soTinChi);
		System.out.println("mh2.ten = " + mh2.ten);
		System.out.println("mh2.soTinChi = " + mh2.soTinChi);
	}

}

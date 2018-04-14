package nhoanggiang.bai68;

public class MyException extends RuntimeException{
	private String loi;
	
	

	public MyException(String loi) {
		super();
		this.loi = loi;
	}

	public String getLoi() {
		return loi;
	}

	public void setLoi(String loi) {
		this.loi = loi;
	}
	

}

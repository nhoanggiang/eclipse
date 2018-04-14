package nhoanggiang.bai45;

public class Employee extends Person{
	private int soNamKN;
	
	

	public Employee() {

	}

	public Employee(String ten, int soNamKN) {
		super(ten);
		this.soNamKN = soNamKN;
	}

	public int getSoNamKN() {
		return soNamKN;
	}

	public void setSoNamKN(int soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	public double luong(){
		if (this.soNamKN <1){
			return super.luong()*1.5;
		}
		else if (this.soNamKN >= 1 && this.soNamKN < 3){
			return super.luong()*2;
		}
		else{
			return super.luong()*3;
		}

	}
	
	
}

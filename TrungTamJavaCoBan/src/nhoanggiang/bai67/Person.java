package nhoanggiang.bai67;

import javax.naming.InsufficientResourcesException;

public class Person {
	public static void print() throws ArrayIndexOutOfBoundsException{
		int[] mang = {1,2};
		System.out.println(mang[2]);
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		//print();
		try{
		exceptionExample();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Nguyen Hoang Giang");
		}
		try{
		exception();
		}
		catch(InsufficientResourcesException e){
			System.out.println(e);
		}
	}
	public static void exceptionExample(){
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void exception() throws InsufficientResourcesException{
		throw new InsufficientResourcesException();
	}
}

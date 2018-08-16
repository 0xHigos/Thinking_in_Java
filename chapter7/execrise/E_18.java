package chapter7.execrise;

import java.util.Random;

class Test{
	Test(int i){
		 System.out.println("Test() ="+i);
	}
}
public class E_18 {
	 
	private String name;
	public E_18(String name){
		this.name=name;
	}
	static final Test t1=new Test(1);
	private final Test t2=new Test(2);
	static final String SFS = "static final"; // class constant
	private final String fs = "final";
	private static Random rand = new Random();
	static final int SFI = rand.nextInt(10); // class constant 
	private final int fi = rand.nextInt(10);
	public String toString() {
		return (name + ": " + t1 + ", " + t2 + ", " + SFS + ", " + fs + ", " + SFI + ", " + fi);   
	} 		
	public static void main(String[] args) {
		E_18 d1 = new E_18("d1");
		E_18 d2 = new E_18("d2");
		E_18 d3 = new E_18("d3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
	}
}

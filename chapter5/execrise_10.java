package chapter5;

class C{
	boolean B=true;
	C(boolean b){
		B=b;
	}
	public void checkB(){
		B=true;
	}
	public void finalize(){
		if(B)
			System.out.println("the value is true");
	}
}
public class execrise_10 {
	 public static void main(String[] args) {
		C c=new C(true);
		c.checkB();
		System.out.println(c.B);
		System.gc();
	}
	 
	 
	 
}

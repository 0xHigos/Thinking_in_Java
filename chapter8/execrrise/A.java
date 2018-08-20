package chapter8.execrrise;

class B{
	public void eat(){
		print();
	}
	public void print(){
		System.out.println("B");
	}
}
class C extends B{
	public void print(){
		System.out.println("CC");
	}
}
public class A {
 public static void main(String[] args) {
	 	C c=new C();
	 	c.eat();
}
}

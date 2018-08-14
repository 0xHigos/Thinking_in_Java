package chapter5;

class A{
	public void method1(){
		this.method2();
		System.out.println("------------------------");
		method2();
	}
	public void method2(){
		System.out.println("method2");
	}
}
public class execrise_8 {
	public static void main(String[] args) {
		A a=new A();
		a.method1();
	}
}

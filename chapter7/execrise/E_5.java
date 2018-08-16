package chapter7.execrise;

class A{
	A(){
		System.out.println("A");
	}
}
class B {
	B(){
		System.out.println("B");
	}
}

public class E_5  extends A{
  B b =new B();
  public static void main(String[] args) {
	E_5 e=new E_5();
}
}

package chapter7.execrise;
class withFinals{
	private  final void f(){
		System.out.println("withFinals f()");
	}
	private void g(){
		System.out.println("withFinals g()");
	}
}
public class E_21 extends withFinals {
	public  final void f(){
		System.out.println("E_21 f()");
	}
	
	public static void main(String[] args) {
		E_21 e=new E_21();
		e.f();
	}
}

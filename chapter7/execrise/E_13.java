package chapter7.execrise;


class AA{
	public void aa(int i){
		System.out.println("aa(int)");
	}
	public void aa(char i){
		System.out.println("aa(char)");
	}
	public void aa(String i){
		System.out.println("aa(String)");
	}
}
public class E_13 extends AA {
	public void aa(float i){
		System.out.println("aa(float)");
	}
	public static void main(String[] args) {
		E_13 e=new E_13();
		e.aa(11);
		e.aa(1.2f);
		e.aa('x');
		e.aa("sss");
		
	}
}

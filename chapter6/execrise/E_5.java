package chapter6.execrise;

class exercise_5{
	String name;
	
	private void print_1(){
		System.out.println("private ");
	}
	public void print_2(){
		System.out.println("public");
	}
	protected void print_3(){
		System.out.println("protected");
	}
	void print_4(){
		System.out.println("none");
	}
}
class SomeDate{
	protected int a=13;
}
class DateChanger{
	static void change(SomeDate sd,int i){
		sd.a=i;
	}
}
public class E_5 {
	public static void main(String[] args) {
		exercise_5 e=new exercise_5();
		e.print_2();
		
		e.print_3();
		e.print_4();
		
		
		
		SomeDate x=new SomeDate();
		System.out.println(x.a);
		DateChanger.change(x, 99);
		System.out.println(x.a);
		
		
	}
	

}

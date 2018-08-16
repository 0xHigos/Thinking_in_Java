package chapter7.execrise;

class Execrise_1{
	private String name;
	 Execrise_1() {
		// TODO Auto-generated constructor stub
		 System.out.println("Exercise_1.");
		 name="Constructed.";
	}
	@Override
	public String toString() {
		return "Execrise_1 [name=" + name + "]";
	}
	 
}
public class E_1 {
	 private String name1,name2,name3;
	 private Execrise_1 ee;
	 E_1(){
		 System.out.println("Inside E_1()");
		 name1="aaa";
		 name2="bbb";
		 name3="ccc";
	 }
	@Override
	public String toString() {
		if(ee ==null) 
			ee=new Execrise_1();
		return "E_1 [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3
				+ ", ee=" + ee + "]";
	}
	public static void main(String[] args) {
		E_1 e=new E_1();
		System.out.println(e);
	}
	 
}

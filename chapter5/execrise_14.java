package chapter5;

class CharT{
	static String name;
	static String name2;
	CharT(){
		name2="aaa";
		System.out.println("name2=="+name2);
	}
	static {
		name="xujie";
		System.out.println("name=="+name);
	}
	public void f(){
		System.out.println("name=" +name+"  name2" +name2);
	}
}
public class execrise_14 {
	 public static void main(String[] args) {
		CharT c=new CharT();
		c.f();
		
	}
}

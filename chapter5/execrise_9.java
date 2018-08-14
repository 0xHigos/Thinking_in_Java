package chapter5;

class b{
	String name;
	int i;
	public b(String name){
		this.name=name;
	}
	public b(String name,int i){
		this(name);
		this.i=i;
	}
	public void print(){
		System.out.println("name=" +name +"  i" +i);
	}
}
public class execrise_9 {
	public static void main(String[] args) {
		b b1=new b("xujie", 25);
		b1.print();
	}

}

package chapter7.execrise;

class Amphibian{
	protected String name;
	public void set(String name){
		this.name=name;
	}
	public void print_Name(String name){
		System.out.println("name ="+name);
	}
	public void tune(Amphibian a){
		print_Name(a.name);
		
	}
	public void swim(){
		System.out.println("Amphibian swim()");
	}
	public void eat(){
		System.out.println("Amphibian eat()");
	}
}
public class Frog  extends Amphibian{
	public void swim(){
		System.out.println("Frog swim()");
	}
	public void eat(){
		System.out.println("Frog eat()");
	}
	 public static void main(String[] args) {
		Frog f=new Frog();
		f.name="xujie";
		f.tune(f);
		f.swim();
		f.eat();
	}
}

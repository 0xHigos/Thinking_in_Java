package chapter8.execrrise;

class Cycle{
	private String name="Cycle";
	public static void Travel(Cycle c){
		System.out.println("Cycle ride()! "+ c);
	}
	public String toString(){
		return this.name;
	}
	private int wheel=0;
	public int Wheel(){
		return wheel;
	}
}
class Unicycle extends Cycle{
	private String name="Unicycle";
	public String toString(){
		return this.name;
	}
	private int wheel=1;
	public int Wheel(){
		return wheel;
	}
	
}
class BiCycle extends Cycle{
	private String name="BiCycle";
	public String toString(){
		return this.name;
	}
	private int wheel=3;
	public int Wheel(){
		return wheel;
	}
}
class Tricycle extends Cycle{
	private String name="Tricycle";
	public String toString(){
		return this.name;
	}
	private int wheel=2;
	public int Wheel(){
		return wheel;
	}
}
public class E_1 {
	 public static void ride(Cycle c){
		  c.Travel(c);
		  System.out.println("Wheel =" +c.Wheel());
	 }
	 public static void main(String[] args) {
		Unicycle u=new Unicycle();
		BiCycle b=new BiCycle();
		Tricycle t=new Tricycle();
		ride(u);
		ride(t);
		ride(b);
	}
}

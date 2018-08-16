package chapter7;

class Villian{
	private String name;
	protected void set(String name){
		this.name=name;
	}
	public Villian(String name){
		this.name=name;
	}
	public String toString(){
		return "I'm a Villian and my name is " +name;
	}
}
public class Orc  extends Villian{
	private int orcNumber;
	public Orc(String name,int orcNumber) {
		super(name);
		// TODO Auto-generated constructor stub
		this.orcNumber=orcNumber;
	}
	public void change(String name,int orcNumber){
		set(name);
		this.orcNumber=orcNumber;
		
	}
	public String toString(){
		return "Orc  "+ orcNumber+": "+super.toString();
	}
	public static void main(String[] args) {
		Orc orc=new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
		Villian v=new Villian("xujie");
		v.set("xx");
		System.out.println(v);
	}

}

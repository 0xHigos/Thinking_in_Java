package chapter7;


class Cleanser{
	private String s="Cleanser";
	public void appendid(String  a){
		s+=a;
	}
	public void dilute(){
		appendid(" dilute()");
	}
	public void apply(){
		appendid(" apply()");
	}
	public void scrub(){
		appendid(" scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args) {
		Cleanser x= new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}
public class Detergent extends Cleanser {
	 
	public void scrub(){
		appendid(" scrub()");
	}
	
	public void foam(){
		appendid("foam()");
	}
	public static void main(String[] args) {
		Detergent x= new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Test base class:");
		Cleanser.main(args);
	}
}

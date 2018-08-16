package chapter7.execrise;



class Clean{
	private String s="Cleanser";
	public void appendid(String  a){
		s+=a;
	}
	
	public void scrub(){
		appendid(" scrub()");
	}
	public String toString(){
		return s;
	}
	
}
public class Detergent extends Clean {
	 public void scrub(){
		 System.out.println("the new  method coverd the old method");
		// super.scrub();
	 }
	 public void sterilize(){
		 System.out.println("sterilize");
	 }
	 
	 public static void main(String[] args) {
		Detergent d=new Detergent();
		d.scrub();
		d.sterilize();
		System.out.println(d);
	}
	
}

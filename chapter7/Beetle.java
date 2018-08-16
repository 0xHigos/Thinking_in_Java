package chapter7;

class Insect{
	private int i=9;
	protected  static int j;
	Insect(){
		System.out.println("i = "+i+" ,j="+j );
		System.out.println("Insect initialized");
		j=39;
	}
	private static int x1=printInit("static Insect.x1 initialized");
	
	 static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect {
	private int k=printInit("Beetle.k initialize");
	public Beetle(){
		
		System.out.println("k=" +k);
		System.out.println("j=" +j);
	}
	private static int x2=printInit("static Beetle.x2 initialized");
	
	public static void main(String[] args) {
		System.out.println("Beetle contructor.");
		Insect i=new Insect();
		Beetle b =new Beetle();
	}

	
}

package chapter7.execrise;

class Poppet{
	private int i;
	Poppet(int ii){
		i=ii;
	}
	public  String toString(){
		return ("Poppet" +i);
	}
}
public class BlankFinal {
	private final Poppet p;
	public BlankFinal(){
		
		p= new Poppet(1);
	}
	public BlankFinal(int x){
		
		p= new Poppet(x);
	}
	public static void main(String[] args) {
		System.out.println(new BlankFinal());
		System.out.println(new BlankFinal(47));
	}
}

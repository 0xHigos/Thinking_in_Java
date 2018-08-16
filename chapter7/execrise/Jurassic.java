package chapter7.execrise;


class SmallBrain{
	
}
final class Dinosaur{
	int i=7;
	int j=1;
	SmallBrain x=new SmallBrain();
	void f(){}
	
}
/*class Bird extends Dinosaur{
	 //cannot 7
	  * 
	  * subclass the final class Dinosaur
}*/
public class Jurassic {
	 
	public static void main(String[] args) {
		Dinosaur n=new Dinosaur();
		n.f();
		n.i=40;
		n.j++;
		
		
		
		
	}
} 

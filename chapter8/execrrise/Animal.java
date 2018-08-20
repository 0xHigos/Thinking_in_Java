package chapter8.execrrise;

import java.util.Random;


class Mouse extends Rodent{
	 public void eat(){
		 System.out.print("Mouse eat()\t");
	 }
	 public void sleep(){
		 System.out.println("Mouse sleep()");
	 }
	 public String toString(){
		 return "Mouse";
	 }
}
class Gerbil extends Rodent{
	 public void eat(){
		 System.out.print("Gerbil eat()\t");
	 }
	 public void sleep(){
		 System.out.println("Gerbil sleep()");
	 }
	 public String toString(){
		 return "Gerbil";
	 }
}
class Hamster extends Rodent{
	 public void eat(){
		 System.out.print("Hamster eat()\t");
	 }
	 public void sleep(){
		 System.out.println("Hamster sleep()");
	 }
	 public String toString(){
		 return "Hamster";
	 }
}

public class Animal {
	 private Random rand=new Random(47);
	 public Rodent next(){
		 switch(rand.nextInt(3)){
			 default: System.out.println("the number is not between 0 and 2");
			 case 0:return new Mouse();
			 case 1:return new Gerbil();
			 case 2:return new Hamster();
		 }
	 }
	
  public static void main(String[] args) {
	Animal  a =new Animal();
	Rodent[] r=new Rodent[9];
	for(int i=0;i<r.length;i++)
		r[i]=a.next();
	int j=1;
	for(Rodent rr:r){
		
		rr.eat();
		rr.sleep();
		System.out.println(j+" "+rr);
		j++;
	}
}

}

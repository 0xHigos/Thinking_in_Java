package chapter8;

 class Meal{
	 Meal(){
		 System.out.println("Meal()");
	 }
	 
 }
 class Bread{
	 Bread(){
		 System.out.println("Bread()");
	 }
 }
 class Cheese{
	 Cheese(){
		 System.out.println("Cheese()");
	 }
 }
 class Lettuce{
	 Lettuce(){
		 System.out.println("Lettuce()");
	 }
 }
 class Lunch extends Meal{
	 Lunch(){
		 System.out.println("Lunch()");
	 }
	 
 }
 class PortableLunch extends Lunch{
	 public PortableLunch() {
		// TODO Auto-generated constructor stub
		 System.out.println("PortableLunch()");
	}
 }
 class Pickle extends Bread {
	 public Pickle(){
		 System.out.println("Pickle()");
	 }
 }
 
 


public class Sandwich  extends PortableLunch{
	private Pickle b=new Pickle();
	private Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	 public static void main(String[] args) {
		new Sandwich();
	}
	 
}

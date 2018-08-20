package chapter8.execrrise;

public class Circle extends Shape {
	@Override
	 public void draw(){
		 System.out.println("Circle draw()");
	 }
	@Override
	 public void erase(){
		 System.out.println("Cricle erase()");
	 }
	public void print(){
		 System.out.println("this is a new method in Circle");
	 }
}

package chapter8.execrrise;


public class Triangle extends Shape {
	@Override
	public void draw(){
		 System.out.println("Triangle draw()");
	 }
	@Override
	 public void erase(){
		 System.out.println("Triangle erase()");
	 }
//	public void print(){
//		 System.out.println("this is a new method in Triangle");
//	 }
}

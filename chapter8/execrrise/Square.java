package chapter8.execrrise;

import chapter8.execrrise.Shape;

public class Square extends Shape {
	@Override
	public void draw(){
		 System.out.println("Square draw()");
	 }
	@Override
	 public void erase(){
		 System.out.println("Square erase()");
	 }
//	public void print(){
//		 System.out.println("this is a new method in Square");
//	 }
	 
}

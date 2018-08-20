package chapter8;

import java.util.Random;

import chapter8.execrrise.Shape;
import chapter8.execrrise.Triangle;

public class RandomShapeGenerator {
	 private Random rand=new Random(47);
	 public Shape next(){
		 switch(rand.nextInt(3)){
			 default: System.out.println("the number is not between 0 and 2");
			 case 0:return new Circle();
			 case 1:return new Square();
			 case 2:return new Triangle();
		 }
	 }
}

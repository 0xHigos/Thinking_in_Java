package chapter8;

import java.util.Random;

import chapter8.execrrise.Shape;
import chapter8.execrrise.Triangle;
 
class Stringed extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Stringed play()" +n);
	} 
	public String toString(){
		  return "Stringed";
	  }
	  void adjust(){
		  System.out.println("Adjusting Stringed");
	  }
}
class Brass extends Instrument{
	@Override
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("Brass play()" +n);
	} 
	  void adjust(){
		  System.out.println("Adjusting Brass");
	  }
	  public String toString(){
		  return "Brass";
	  }
}
class Woodwind extends Wind{
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("WoodWind play()" +n);
	} 
	 String what(){
		 return "Woodwind";
	 }
	 public String toString(){
		  return "Woodwind";
	  }
}
class violin extends Wind{
	public void play(Note n) {
		// TODO Auto-generated method stub
		System.out.println("violin play()" +n);
	} 
	 String what(){
		 return "violin";
	 }
	 public String toString(){
		  return "violin";
	  }
}
public class Music2 {
	private Random rand=new Random(47);
	
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e)
			tune(i);
	}
	 public Instrument next(){
		 switch(rand.nextInt(6)){
			 default: System.out.println("the number is not between 0 and 2");
			 case 0:return new Wind();
			 case 1:return new Percussion();
			 case 2:return new Brass();
			 case 3:return new Stringed();
			 case 4:return new Woodwind();
			 case 5:return new violin();
		 }
	 }
	public static void main(String[] args) {
		Music2 m=new Music2();
		Instrument[] orchestra=new Instrument[9];
		for(int i=0;i<orchestra.length;i++)
			 orchestra[i]=m.next();
		tuneAll(orchestra);
		for(Instrument i:orchestra)
			System.out.println(i);
	}
	
}

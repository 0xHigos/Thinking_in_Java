package chapter8;

public class Percussion  extends Instrument{
	  public void play(Note n){
		  System.out.println("Percussion play()"+n);
	  }
	  String what(){
		  return "Percussion";
	  }
	  void adjust(){
		  System.out.println("Adjusting Percussion");
	  }
	  public String toString(){
		  return "percussion";
	  }
}

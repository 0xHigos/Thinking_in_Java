package chapter8;

public class Instrument {
	  public void play(Note n){
		  System.out.println("Intstrument play()" +n);
	  }
	  String what(){
		  return "Wind";
	  }
	  void adjust(){
		  System.out.println("Adjusting Instrument");
	  }
	  public String toString(){
		  return "Instrument";
	  }
	  
}

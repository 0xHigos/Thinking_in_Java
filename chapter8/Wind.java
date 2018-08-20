package chapter8;

public class Wind  extends Instrument{
	
	@Override
	 public void play(Note n) {
		System.out.println("Wind.play()" +n);
	}
	 String what(){
		  return "Wind";
	  }
	  void adjust(){
		  System.out.println("Adjusting Wind");
	  }
	  public String toString(){
		  return "Wind";
	  }
}

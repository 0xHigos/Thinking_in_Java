package chapter5;

class Book{
	boolean checkOut=false;
	Book(boolean checkOut){
		this.checkOut=checkOut;
	}
	void checkIn(){
		checkOut=false;
		
	}
	protected void finalize() throws Throwable{
		super.finalize();
		if(checkOut)
			System.out.println("Error: checked out");
	}
	
	
	
	
}
public class TerminationCondition {
	 public static void main(String[] args) {
		Book novel =new Book(true);
		novel.checkIn();
		new Book(true);
		System.gc();
		
		
	}
}

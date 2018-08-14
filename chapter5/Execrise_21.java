package chapter5;

public class Execrise_21 {
	Money degree;
	 public static void main(String[] args) {
		for(Money m:Money.values())
			System.out.println(m+", ordinal "+m.ordinal());
	}
	 public void describe(){
			System.out.print("this Burrito is ");
			switch(degree){
			case ONE:System.out.println("not spicy at all.");break;
			case TWO:
			case THREE:System.out.println("a little hot.");break;
			case FOUR:
			case FIVE:
			case SIX:
			default: System.out.println("maybe too hot.");
			
			}
		}
}

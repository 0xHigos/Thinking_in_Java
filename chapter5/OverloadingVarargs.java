package chapter5;


public class OverloadingVarargs {

		static void f(Character...characters ){
			System.out.println("first");
			for(Character c:characters){
				System.out.print(" "+c);
			}
			System.out.println();
			
		}
		static void f(Integer...characters ){
			System.out.println("second");
			for(Integer c:characters){
				System.out.print(" "+c);
			}
			System.out.println();
			
		}
		static void f(Long...longs ){
			System.out.println("Third");
		}
		static void f(float i,Character...characters ){
			System.out.println("second11");
		}
	
		
		public static void main(String[] args) {
			f(1,'a');
			//f('a','b');
		}
}

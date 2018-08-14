package chapter3;

public class ShortCircuit_3_8_1 {
	
	static boolean test1(int val){
		System.out.println("test1(" +val+")");
		System.out.println("result:" +(val<1));
		return val<1;
	}
	static boolean test2(int val){
		System.out.println("test1(" +val+")");
		System.out.println("result:" +(val<2));
		return val<2;
	}
	static boolean test3(int val){
		System.out.println("test1(" +val+")");
		System.out.println("result:" +(val<3));
		return val<3;
	}
	// 短路演示，后面的test3 未执行
	public static void main(String[] args) {
		boolean b=test1(0) && test2(2) && test3(2);
		System.out.println("expression is "+b);
	}
}

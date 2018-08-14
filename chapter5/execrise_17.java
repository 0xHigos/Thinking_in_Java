package chapter5;

import java.util.Arrays;
import java.util.Random;

class E_17{
	String name;
	E_17(){
		System.out.println("the value of name is not initialized");
	}
	E_17(String name){
		System.out.println(name);
	}
}
public class execrise_17 {
	public static void main(String[] args) {
		E_17[] e=new E_17[new Random().nextInt(20)];
		System.out.println(Arrays.toString(e));
	}
}

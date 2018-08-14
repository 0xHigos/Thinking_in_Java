package chapter3;

import java.util.Random;


public class URShift3_11 {
	 public static void main(String[] args) {
		/*int i=-1;
		System.out.println(Integer.toBinaryString(i));
		
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		
		long l=-1;
		System.out.println(Long.toBinaryString(l));
		
		l >>>=10;
		System.out.println(Long.toBinaryString(l));
		
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
		
		byte b=-1;
		System.out.println(Integer.toBinaryString(b));
		
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		
		b=-1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
		*/
		
		Random rand=new Random();
		int i=rand.nextInt();
		int j=rand.nextInt();
		printBinaryInt("-1", i);
		printBinaryInt("+1", j);
		int maxpos=2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg=-2147483648;
		printBinaryInt("maxneg", maxneg);
		printBinaryInt("i", i);
		printBinaryInt("~i", i);
		printBinaryInt("j", j);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i<< 5", i << 5);
		printBinaryInt("i ^ j", i  ^j);
		printBinaryInt("i >> 5", i >> 5);
		printBinaryInt("(~i)>> 5", (~i)>> 5);
		printBinaryInt("i >>> 5", i >>> 5);
		printBinaryInt("(~i)>>> 5", (~i)>>> 5);
		
		
		 
		 
		 
		 
		 
	}
	 
	 static void printBinaryInt(String s,int i){
		 print(s+", int " +i+" . binary:\n "+Integer.toBinaryString(i));
	 }
	 static void printBinaryLong(String s,long i){
		 print(s+", int " +i+" . binary:\n "+Long.toBinaryString(i));
	 }
	 public static void print(Object object){
		  System.out.println(object);
	  }
}

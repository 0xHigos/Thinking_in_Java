package chapter3;

public class Literals_3_9 {
 public static void main(String[] args) {
	/*int i1=0x2f;
	System.out.println("i1:    "+ Integer.toBinaryString(i1));
	int i2=0x2F;
	System.out.println("i2:    "+ Integer.toBinaryString(i2));
	int i3=0x2f;
	System.out.println("i3:    "+ Integer.toBinaryString(i3));
	char c=0xfff;
	System.out.println("c:    "+ Integer.toBinaryString(c));
	byte b=0x7f;
	System.out.println("b:    "+ Integer.toBinaryString(b));
	short s=0x7fff;
	System.out.println("s:    "+ Integer.toBinaryString(s));*/
	
	 
	 //e 代表 "10的幂次"
	float expFloat = 1.39e-43f;
	expFloat= 1.39E-43F;
	System.out.println(expFloat );
	double expDouble=47e47d;
	double exDouble2=47e47;
	System.out.println(expDouble);
	System.out.println(exDouble2);
	
	//练习
	float f1=Float.MAX_VALUE;
	System.out.println(f1);
	double d1=Double.MAX_VALUE;
	System.out.println(d1);
	
}
}

package chapter3;

public class StringOperators {
 public static void main(String[] args) {
	int x=0,y=1,z=2;
	String s="x,y,z";
	System.out.println(s+x+y+z);
	System.out.println(x+"   " +s);
	s+="(summed) = ";
	System.out.println();
	System.out.println(s+(x+y+z));
	System.out.println(""+x );
		
	boolean b1=true;
	boolean b2=false;
	while(b1!=b2){
		System.out.println("the boolean number is used ");
		break;
		
	}
	
	double above=0.7,below=0.4;
	float fabove=0.7f,fbelow=0.4f;
	System.out.println("(int)above" +(int) above);
	System.out.println("(int)below" +(int) below);
	System.out.println("(int)fabove" +(int) fabove);
	System.out.println("(int)fbelow" +(int) fbelow);
	
	
	
	
	System.out.println("Math.round(above)" +Math.round(above));
	System.out.println("Math.round(below)" +Math.round(below));
	System.out.println("Math.round(fabove)" +Math.round(fabove));
	System.out.println("Math.round(fbelow)" +Math.round(fbelow));
	
	
	int big=Integer.MAX_VALUE;
	System.out.println("big  ==" +big);
	int bigger=big*4;
	System.out.println("bigger == "+bigger);
	
}
}

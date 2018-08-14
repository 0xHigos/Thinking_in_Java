package chapter3;

public class AutoInc {
 public static void main(String[] args) {
	/* 
	 //++ and --
	int i=1;
	System.out.println("i:"+i);
	System.out.println("++i:"+ ++i);
	System.out.println("i++:"+ i++);
	System.out.println("i:"+i);
	System.out.println("--i:"+ --i);
	System.out.println("i--:"+ i--);
	System.out.println("i:"+i);*/
/*	 
	// == 是比较对象的引用，并非比较两个对象的值 
	// equals 是用来比较两个对象的实际内容，不适用基本类型
	Integer n1=new Integer(47); 
	Integer n2=new Integer(47); 
	System.out.println(n1== n2);
	System.out.println(n1!= n2);
	System.out.println(n1.equals(n2)); 
	 
	*/ 
	
	// equals 默认比较引用 
	Value v1=new Value();
	Value v2=new Value();
	v1.i=v2.i=100;
	System.out.println(v1.equals(v2));
	
	 
	
}
 
}
class Value{
	 int i;
}

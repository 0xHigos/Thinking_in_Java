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
	// == �ǱȽ϶�������ã����ǱȽ����������ֵ 
	// equals �������Ƚ����������ʵ�����ݣ������û�������
	Integer n1=new Integer(47); 
	Integer n2=new Integer(47); 
	System.out.println(n1== n2);
	System.out.println(n1!= n2);
	System.out.println(n1.equals(n2)); 
	 
	*/ 
	
	// equals Ĭ�ϱȽ����� 
	Value v1=new Value();
	Value v2=new Value();
	v1.i=v2.i=100;
	System.out.println(v1.equals(v2));
	
	 
	
}
 
}
class Value{
	 int i;
}

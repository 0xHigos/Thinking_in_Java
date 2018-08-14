package chapter4;

import org.junit.Test;

public class exercise_8 {
	@Test
	public void test_execrise_8(){
	for(int i=0;i<10;i++){
		switch(i){
		case 1:System.out.println("the number is: "+i );break;
		case 2:System.out.println("the number is: "+i );break;
		case 3:System.out.println("the number is: "+i );break;
		case 4:System.out.println("the number is: "+i );break;
		case 5:System.out.println("the number is: "+i );break;
		case 6:System.out.println("the number is: "+i );break;
		case 7:System.out.println("the number is: "+i );break;
		case 8:System.out.println("the number is: "+i );break;
		case 9:System.out.println("the number is: "+i );break;
		case 0:System.out.println("the number is: "+i );break;
		default : System.out.println("the number is default");
			}
		}
	}
	@Test
	public void test_Vampire(){
		String[] ar_str1=null,ar_str2;
		int sum=0,count=0;
		for(int i=10;i<100;i++){
			for(int j=i;j<100;j++){
				int i_val=i*j;
				if(i_val<1000 || i_val >9999)
					continue;
				count++;
				ar_str1=String.valueOf(i_val).split("");
				ar_str2=(String.valueOf(i)+String.valueOf(j)).split("");
				java.util.Arrays.sort(ar_str1);
				java.util.Arrays.sort(ar_str2);
				if(java.util.Arrays.equals(ar_str1, ar_str2)){
					sum++;
					System.out.println("第 "+sum+"组：" + i +"*"+j+ "=" +i_val);
					
				}
			}
		}
		System.out.println("共找到" +sum+" 组吸血鬼"+"\ncount"+count);
	}
	
	
	/*@Test
	public void test_Vampire(){
		int T,h,t,n;
		for(int i=10;i<=9999 && (i%10) ==0;i++){
			if( i/100 == 0 )
				continue;
			
			T=(i/1000);
			h=((i-T*1000)/100);
			t=((i-T*1000-h*100)/10);
			n=(i%10);
			
			
			if(((T*10+h)*(t*10+n)) ==i ){
				System.out.println("the satisfactied number is :"+i);
			}else if(((T*10+h)*(n*10+t)) ==i ){
				System.out.println("the satisfactied number is :"+i);
			}else if(((T*10+h)*(n*10+t)) ==i ){
				System.out.println("the satisfactied number is :"+i);
			}else if(((h*10+T)*(t*10+n)) ==i ){
				System.out.println("the satisfactied number is :"+i);
			}else if(((h*10+T)*(t*10+n)) ==i ){
				System.out.println("the satisfactied number is :"+i);
			}
			
		}
	}*/
	

	public static void Fibonacci(int number){
		int n1=0,n2=1;
		int n3=1;
		System.out.println("the number is：");
		while(n3<=number){
			System.out.print(n3+"\t");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
	public static void main(String[] args) {
		Fibonacci(34);
	}
}

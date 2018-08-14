package chapter4;

import java.util.Random;

import org.junit.Test;

public class Exercise_4_3 {
	 
	//练习一至四
	@Test
	public void test1(){
		for(int i=1;i<=100;i++){
			System.out.print(i+"\t");
			if(i %8 ==0)
				System.out.println();
		}
	}
	
	@Test
	public void test2(){
		int rand1,rand2=0;
		for(int i=0;i<24;i++){
			Random rand=new Random();
			rand1 =rand.nextInt(10);
			if(i==0){
				System.out.println("the number of  "+rand1 +"== itself");
			}else if(rand2 > rand1){
				System.out.println("rand1  >rand2" );
			}else if(rand1 == rand2){
				System.out.println("rand1 == rand2");
			}else{
				System.out.println("rand1 < rand2");
			}
			System.out.println(rand1);
			System.out.println(rand2);
			rand2=rand1;
		}
	}
	
	@Test
	public void test3(){
		int rand1=0,rand2=0;
		while(true){
			Random rand=new Random();
			rand1 =rand.nextInt(10);
		    if(rand2 > rand1){
				System.out.println("rand1  >rand2" );
			}else if(rand1 == rand2){
				System.out.println("rand1 == rand2");
			}else{
				System.out.println("rand1 < rand2");
			}
			System.out.println(rand1);
			System.out.println(rand2);
			rand2=rand1;
		}
	}
	
	@Test 
	public void test4(){
		for(int i=1;i<100;i++){
			int k=0;
			for(int j=i-1;j>1;j--){
				if(i%j ==0){
					k=1;
					break;
				}
			}
			if(k==0){
				System.out.println(i +" 是素数！");
			}
			
		}
	}
}

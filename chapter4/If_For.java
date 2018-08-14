package chapter4;

import java.util.Random;

import org.junit.Test;


//if-else 
public class If_For {
	
	public static void main(String[] args) {
		int i=0;
		outer:
		for(;true;){
			inner:
			for(;i<10;i++){
				System.out.println("i= "+i);
				
				if(i==2){
					System.out.println("continue");
					continue;
				}
				
				if(i==3){
					System.out.println("break");
					i++;
					break;
				}
				
				if(i== 7){
					System.out.println("continue outer");
					i++;
					continue outer;
				}
				if(i== 8){
					System.out.println("break outer");
					break outer;
				}
				
				for(int k=0;k<5;k++){
					if(k==3){
						System.out.println("continue inner");
						continue inner;
					}
				}
				
			}
		}
			
	}
	static int result=0;
	static void test(int testval, int target){
		if(testval > target)
			result =+1;
		else if(testval < target)
			result= -1;
		else 
			result =0 ;
		
	}
	@Test
	 public void test_IFElse() {
		test(10,5);
		System.out.println(result);
		test(5,10);
		System.out.println(result);
		test(5,5);
		System.out.println(result);
	}
//   end
	
	//while 
	static  boolean condition(){
		boolean result2=Math.random() <0.99;
		System.out.println(result2 +" .");
		return result2;
	}
	
	@Test
	public void test_While(){
		while(condition())
			System.out.println("Inside 'While'");
		System.out.println("Exited 'While'");
	}
	// end While
	
	
	//Start For
	@Test
	public void test_For(){
		for(char c=0;c<128;c++)
			if(Character.isLowerCase(c))
				System.out.println("value :" +(int)c +"  Character:  " +c);
	}
	//end For
	
	//start ¶ººÅ²Ù×÷·û
	@Test
	public void test_4_3_3(){
		for(int i=1,j=i+10;i<5;i++,j=i*2){
			System.out.println("i= " +i+" j =" +j);
		}
	}
	@Test
	public void test_ForEach(){
		Random rand=new Random(47);
		float f[] =new float[10];
		for(int i=0;i<10;i++){
			f[i]=rand.nextFloat();
		}
		for(float x:f){
			System.out.println(x);
		}
		for(char c : "An African Swallow".toCharArray())
			System.out.print(c+" ");
	}
	@Test
	public void test_VowelAndConsonants(){
		Random rand=new Random(47);
		System.out.println((int)'A');
		for(int i=0;i<100;i++){
			int c=rand.nextInt(26)+'a';
			
			System.out.print((char)c +", "+c +" :  ");
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':System.out.println("vowel");break;
			case 'y':
			case 'w':System.out.println("sometime a vowel");break;
			default: System.out.println("consonant");
				
			}
		}
	}
	
}

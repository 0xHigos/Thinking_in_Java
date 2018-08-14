package chapter5;

class E_19{
	E_19(){
		
	}
	E_19(String... name){
		for(String n :name)
			System.out.print(n+" ");
		System.out.println();
	}
}
public class execrise_19 {
	
	public static void main(String[] args) {
		String [] n={"a","b","c","dd","ee"};
		E_19 e1=new E_19(n);
		
		E_19 e2=new E_19("aa","bb","cc","dd");
		
		
	}
	 
	 
	 
}

package chapter7;


class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
		
	}
	
	float doh(float f){
		System.out.println("Float(f)");
		return 1.f;
		
	}

}
class Milhouse{
	
}
class Lisa extends Homer{
	@Override char doh(char f){
		System.out.println("doh(Milhouse)");
		return f;
	}
}

class Bart extends Homer{
	void doh(Milhouse m){
		System.out.println("doh(Milhouse)"); 
	}
}
public class Hide {
	
	public static void main(String[] args) {
		Bart b=new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(new Milhouse());
	}
}

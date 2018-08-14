package chapter5;

public class Leaf {
	int i=0;
	Leaf increment(){
		i++;
		System.out.print("µ÷ÓÃ\t");
		return this;
	}
	void print(){
		System.out.println("i=" +i);
	}
	public static void main(String[] args) {
		Leaf x=new Leaf();
		x.increment().increment().increment().print();
	}
}

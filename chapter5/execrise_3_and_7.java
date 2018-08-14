package chapter5;

class T{
	public T(){
		System.out.println("the constructor is default");
	}
	public T(String  name){
		System.out.println("name is " +name); 
	}
}
class Dog{
	public void bark(int i){
		System.out.println("Barking");
	}
	public void bark(String i){
		System.out.println("Howling");
	}
	public void bark(String i,int j){
		System.out.println("Howling and Barking");
	}
	public void bark(int j,String i){
		System.out.println("Barking and Howling");
	}
}
class s{
	public void ss(){
		System.out.println("s");
	}
}
public class execrise_3_and_7 {
	public static void main(String[] args) {
		T t=new T();
		T t1=new T("xujie");
		
		Dog d=new Dog();
		d.bark(1);
		d.bark("1");
		d.bark(1, "1");
		d.bark("1", 1);
		s s=new s();
		s.ss();
	}
}

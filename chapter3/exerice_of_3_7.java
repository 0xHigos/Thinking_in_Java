package chapter3;


public class exerice_of_3_7 {
	public static void main(String[] args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		spot.name="spot";
		scruffy.name="scruffy";
		spot.says="Ruff!";
		scruffy.says="Wurf!";
		
		System.out.println(spot);
		System.out.println(scruffy);
		
		
		Dog dog1=spot;
		// == 和 euqals 默认比较引用 ，所以 两个都个都是true
		System.out.println(dog1 == spot);
		System.out.println(dog1.equals(spot));
	}
}
class Dog{
	 String name;
	 String says;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSays() {
		return says;
	}
	public void setSays(String says) {
		this.says = says;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", says=" + says + "]";
	}
	 
}
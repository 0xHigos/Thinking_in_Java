package chapter7.execrise;

class BB{
	private String name;
	BB(String name){
		this.name=name;
	}
	protected void set(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "BB [name=" + name + "]";
	}
	
}
public class E_15 extends BB{
	private String name;
	private int number;
	E_15(String name,int number) {
		super(name);
		// TODO Auto-generated constructor stub
		this.number=number;
	}
	

	@Override
	public String toString() {
		return "E_15 [ number=" + number + " ,"+super.toString();
	}
	public static void main(String[] args) {
		E_15 e=new E_15("xujie",22);
		System.out.println(e);
	}

	

}

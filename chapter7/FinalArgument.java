package chapter7;

class Gizmo{
	public void spin(){
		
	}
}

public class FinalArgument {
	 
	void with(final Gizmo g){
		//g=new Gizmo();
	}
	void without(Gizmo g){
		g=new Gizmo();
		g.spin();
	}
	int g(final int i){
		return i+1;
	}
	public static void main(String[] args) {
		FinalArgument bf=new FinalArgument();
		bf.without(null);
		bf.with(null);
	}
}

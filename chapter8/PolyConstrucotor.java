package chapter8;

class Glyph{
	void draw(){
		
	}
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph after draw()");
	}
}

class RoundGlyph extends Glyph{
	private int radius=1;
	public RoundGlyph(int r) {
		// TODO Auto-generated constructor stub
		radius=1;
		System.out.println("RoundGlyph.RoundGlyph() radius =" +radius);
	}
	void draw(){
		System.out.println("RoundGlyph.RoundGlyph() radius =" +radius);
	}
}
public class PolyConstrucotor {
 public static void main(String[] args) {
	new RoundGlyph(5);
}
}

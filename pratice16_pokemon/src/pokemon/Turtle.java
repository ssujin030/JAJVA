package pokemon;

public class Turtle extends Pokemon{
	
	
	public Turtle() {
		name = "꼬북이";
		hp = 90;
		atk = 15;
		def = 8;
		
	}
	
	@Override
	public void skill() {
		System.err.println("? 발사 ~!");
		
	}

}

package pokemon;

public class Lizard extends Pokemon {
	
	public Lizard() {
		name = "파이리";
		hp = 100;
		atk = 12;
		def = 3;
		
	}
	
	@Override
	public void skill() {
		System.err.println("화염 발사 ~!");
		
	}




}

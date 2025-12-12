package pokemon;

public class Pikachu extends Pokemon{

	
	public Pikachu() {
		name = "피카츄";
		hp = 100;
		atk = 10;
		def = 5;
		
	}
	
	@Override
	public void skill() {
		System.err.println("백만 볼트 ~!");
		
	}

}

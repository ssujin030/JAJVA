package Pokemon;

public class Pikachu extends Pokemon implements PokemonAction {
	
	public Pikachu() {
		super.name = "피카츄";
		hp = 100;
		atk = 10;
	}
	@Override
	public void bodyTackleskill() {
		System.out.println("피카츄의 몸퉁박치기!");
	}
	@Override
	public void skill() {
		System.out.println("피카츄의 d몸퉁박치기!");
	}

}

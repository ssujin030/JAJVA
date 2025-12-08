package pokemon;

public class Pikachu extends Pokemon {
	/*
	 * 추상화
	 * 
	 * 상속
	 * 
	 * 메서드 오버라이드
	 * 
	 * super?this?
	 */
	
	public Pikachu() {
		super("잉어킹",10, 0);
	}
	
	@Override
	public void skill() {
		System.out.println("백만 볼트! ");
	}



}


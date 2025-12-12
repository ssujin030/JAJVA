package pokemon;

public abstract class Pokemon {
	
	protected String name;
	protected int hp;
	protected int atk;
	protected int def;
	
	public void bodyTackle() {
		System.out.println( name+"의 몸통 박치기");
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void skill() {
		
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}

	public Pokemon(String name, int hp, int atk, int def) {
		
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public Pokemon() {

		// TODO Auto-generated constructor stub
	}
	

}

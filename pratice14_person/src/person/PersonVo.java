package person;

public class PersonVo {
	
	private String name;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public PersonVo(String name, String phone) {
	
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "PersonVo [name=" + name + ", phone=" + phone + "]";
	}
	public PersonVo() {
		
		// TODO Auto-generated constructor stub
	}

}

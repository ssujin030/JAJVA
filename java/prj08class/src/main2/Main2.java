package main2;

public class Main2 {

	public static void main(String[] args) {
		
		
		//클래스 (필드 + 메서드)
		
		
		Dog dog = new Dog();
		dog.name = "바둑이";
		dog.age = 2;
		
		System.out.println(dog.name);
		dog.hello();
		dog.eat();
		dog.walk();
	}

}

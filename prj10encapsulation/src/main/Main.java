package main;

import animal.Dog;

public class Main {

	public static void main(String[] args) {
		
		
	System.out.println("========캡슐화 =======");
		
		Dog x = new Dog();
		x.setName("바둑이");
		x.setAge(3);
		
		

		System.out.println(x.getName());
		System.out.println(x.getAge());
		
		
		
		/*
		 * 캡슐화 ?
		 * 응집도를 높여주기 위해서
		 * -데이터+기능 한번에 관리
		 * -정보 은닉
		 */

	}

}

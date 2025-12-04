package main;

import kh.Person;

public class Main {

	public static void main(String[] args) {
		/*
		 * [접근제한자]
		 * private		:해당 클래스 내에서만 접근 가능
		 * default		:같은 패키지 내에서 접근 가능//다른패키지 쓰려면 import 해주면 됨
		 * protected	:상속 관계에서 접근 가능
		 * public		:전체 공개
		 * 
		 */
		
		System.out.println("=======접근제한자========");
		
		Person x =new Person();
		x.name = "홍길동";
		x.age = 17; 

	}

}

package main2;

public class Main2 {

	public static void main(String[] args) {
		
		
		//클래스 (필드 + 메서드)
		//메서드 : 명령어들의 묶음 (단축키 같은 개념)

		
		/*
		 * [문법]
		 * 접근제한자 리턴 타입 메서드명(매개변수){실행내용}
		 * 
		 * e.g.
		 * public long hello(int a){ ~~실행 내용임}
		 */
		
		Test x= new Test(); //x라는 변수에 test주소 값 넣어줌
		String s = x.m03(); //m03() 호출한뒤 return 값에 안녕하세요를 변수 s에 담음
		System.out.println(s);
//		-----------------------------------------------------
//		x.m02(20, 100);    -----//이타입을 찾아와라  new Test() 여기서 그리고 메서드 값에 "mon"을 대입하고 계산후 가지고옴 
		String user = x.m04("mon");
		System.out.println(user);  
		// System.out.println(x.m04(10)); 이것도 동일한 결과 ++ return 값이 있어야 사용가능
		 

		
		
		

	}//main

}//class

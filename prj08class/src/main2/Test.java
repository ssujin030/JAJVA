package main2;

public class Test {
	
	//메서드
//	접근제한자 리턴타입(없음(void)) 메서드명 (파라미타) {~~}
	//매개변수 x, 반환 x
	public void m01() {
		System.out.println("메서드 01 호츨됨~~");
	}
	//매개변수 o, 반환 x
	public void m02(int age, int score) {
		System.out.println("메서드02 호출됨");
		System.out.println("매게변수로 전달받은 정수: "+(age+score));
		
	}
	//매개변수 x, 반환 o
	public String m03() {
	System.out.println("메서드03 호출됨");
		return "안녕하세요";
	}
	//매개변수 o, 반환 o
	public String m04(String a) {
		System.out.println("메서드 04 호출됨~~~");
		return a+"ster";
		
		//return new menu 이런식으로 값에 클래스도 가능 걍 전부 다가능~~
	}
	
	
	

}

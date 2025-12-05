package main;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * CLASS:객체 생성을 위한 설계도 (필드+메서드)
		 * 필드 == 멤버변수 == 객체 변수 ==인스턴스 변수
		 * 메서드 == 멤버 메서드 == 객체메서드 == 인스턴스 메서드
		 * - 클래스(틀)를 이용해서 객체를 만들 수 있다.
		 * 
		 * new 생성자메서드()
		 * 
		 * 클래스 파일을 이용해서, 객체 여러개 생성 가능
		 * 클래스는 타입으로써 사용 가능
		 * 
		 * [문법]
		 * 접근제한자 리턴 타입 메서드명(매개변수){실행내용}
		 * 
		 * e.g.
		 * public long hello(int a){~~~~}
		 * 
		 * 
		 */
		
		
		
		// data 여러개 모아서 사용해보기		
		
		Bag x= new Bag();
		x.brand="샤넬";
		x.price=2700;
		x.years =1999;
				
		System.out.println(x.brand);
						
	}//main
	
}//class

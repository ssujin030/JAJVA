package main;

public class GameManager {
	
	//메뉴 출력
	public void printMenu() {
		System.out.println("1.가위바위보");
		System.out.println("2. 업다운");
	}
	
	//가위 바위보 게임하기
	public void rcp() {
		System.out.println("-------가위바위보 ------");
		
	}
	
	
	
	//업다운 게임 하기
	public void updown() {
		System.out.println("-------UP/DOWN ------");
	}
	
	//게임 실행하기	
	public void startGame(int num) {
		switch(num) {
		 case 1:this.rcp();break;
		 case 2:this.updown();break;
		 default: System.out.println("잘못된번호입니다.");
 }
	
	}
	

}

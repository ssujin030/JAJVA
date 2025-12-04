package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ======== 미니게임 천국 =========");
				 
		GameManager gm= new GameManager();
		//메뉴 출력
		gm.printMenu();
	
		//입력받기
		 int num =sc.nextInt();
		 
		 //게임 실행
		 gm.startGame(num);
	
		 
	
		

		
		
		
	}

}

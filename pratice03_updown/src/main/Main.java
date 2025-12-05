package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("======== UP / DOWN ===========");
		
		//도전 횟수
		int random = (int)(Math.random()*50+1);
		int count = 7;	
		
		//정답여부
		boolean isCorrect=false;
		
		while(count > 0) {
			
		
			//남은 도전 홧수 안내
			System.out.println("남은 도전횟수 안내" + count);
			
			//유저 숫자 입력 받기
			System.out.print("1~50 사이의 숫자 입력:");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        	count--;
			//업다운 판단하기
	        if(num>random) {
	        	System.out.println("DOWN");
	        }else if(num<random){
	        	System.out.println("UP");
	        }else {
	        	System.out.println("정답!!!");
//	        	isCorrect = true;
	        	break;
	        }
		
		}//while
	 		System.out.println("게임종료");
	 		if(!isCorrect) {
	 		System.out.println("랜덤값:" + random);
	
 			}
	}
}
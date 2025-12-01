package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("=======제어문 연습(가위바위보)======");

		
		//1.유저입력 받기(1:가위, 2:바위, 3:보자기)
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		
		//2.컴퓨터 값랜덤으로 정하기//범위변환++ 타입변환(dandom) = 원래 bouble임
		int com = (int)(Math.random()*3+1);
		
		//숫자를보고 손 문자열 결정
		
//		if(user==1) {
//			String userHand = "가위";	
//		}else if(user==2) {
//			String userHand = "바위";	
//		}else {
//			String userHand = "보자기";
//		}
		
		String userHand="비었음";
		switch(user) {
		case 1 : userHand = "가위"; break;
		case 2 : userHand = "바위"; break;
		case 3 : userHand = "보자기"; break;
		default : System.out.println("잘못된 숫자입니다.");
		
		}
		String comHand="비었음";
		switch(com) {
		case 1 : comHand = "가위"; break;
		case 2 : comHand = "바위"; break;
		case 3 : comHand = "보자기"; break;
		default : System.out.println("잘못된 숫자입니다.");
		
		}
		
		//우저 및 컴퓨터의 손 공개
		System.out.println("당신:"+ userHand);
		System.out.println("상대:"+ comHand);

	
		//3.판단하고 결과 출력
		if(user==1 && com==3 ||user==2&&com==1||user==3&&com==2) {
		 System.out.println("유저 승리");	
		}else if(user==1&&com==2||user==2&&com==3||user==3||com==1) {
			System.out.println("유저 패배");	
		}else {
			System.out.println("무승부");	
		
		
	
		
		
		}
		
	}

}

package main;

import java.util.Scanner;

public class review01 {

	public static void main(String[] args) {
		//가위바위보게임
		
		//1.유저입력 받기(1:가위, 2:바위, 3:보자기)
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		
		int pc=1;
		
		if(user==1&&pc==3||user==2&&pc==1||user==3&&pc==1) {
			System.out.println("승리");
		}else if(user==1&&pc==2||user==2&&pc==3||user==3&&pc==2) {
			System.out.println("패배");
		}else {
			System.out.println("무승부");
		}
		

	}

	
}
	



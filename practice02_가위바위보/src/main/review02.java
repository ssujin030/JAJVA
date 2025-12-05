package main;

import java.util.Scanner;

public class review02 {
	
	

	public static void main(String[] args) {
		
		System.out.println("-----------가위바위보------------");
		
		//게임안내
		System.out.println("'\'가위'\' '\'바위'\' '\'보'\' ");
		
		int winCnt = 0;
		int loseCnt = 0;
		int drawCnt = 0;
		
		
		while(true) {
			//유저 입력 받기
			Scanner sc = new Scanner(System.in);
			String user = sc.nextLine();	
			
			
			//컴퓨터 손 정하기
			int random = (int)(Math.random()*3+1);
			
			String com ="";
			if(random==1) {
				com="가위";
			}else if(random==2) {
				com="바위";
			}else if(random==3) {
				com="보자기";
			}else {
				com="에러발생~~~";
			}
			
			
			//각각의 손 출력
			System.out.println("당신:" + user);
			System.out.println("상대:" + com);

			
		      // 결과 판단하고 , 출력
		       if(user.equals("가위")) {
		          if(com.equals("보자기")) {
		             System.out.println("승");
		              winCnt++;
		          }else if(com.equals("바위")) {
		             System.out.println("패");
		             loseCnt++;
		          }else {
		             System.out.println("무");
		             drawCnt++;
		          }
		       }else if(user.equals("바위")) {
		          if(com.equals("보자기")) {
		             System.out.println("패");
		             loseCnt++;
		          }else if(com.equals("바위")) {
		             System.out.println("무");
		             drawCnt++;
		          }else {
		             System.out.println("승");
		             winCnt++;
		          }
		       }else if(user.equals("보자기")) {
		          if(com.equals("보자기")) {
		             System.out.println("무");
		             drawCnt++;
		          }else if(com.equals("바위")) {
		             System.out.println("승");
		             winCnt++;
		          }else {
		             System.out.println("패");
		             loseCnt++;
		          }
		       }
			

		}//while
		
		
		
	


	}//main

}//class

//		if(x.equals("가위")) {
//System.out.println("이프문 통과");
//}

//(x=="가위")가위는 문자열(참조형)이기때문에 비교를 할수없음
//때문에 x.equals("가위") 이런식으로 특이하게 비교한다
//따라서 문자열의 동등비교는 equals 기억하면 편함
//x=="가위"----->x.equals("가위")표현 하는것


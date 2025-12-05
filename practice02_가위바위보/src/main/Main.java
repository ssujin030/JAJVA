package main;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      System.out.println("===== 가위바위보 =====");
      
      int winCnt = 0;
      int loseCnt = 0;
      int drawCnt = 0;
      
      while(true) {
         // 게임 안내
         System.out.println("\"가위\" , \"바위\" , \"보자기\" 셋 중 하나를 입력하세요");
         System.out.println("게임을 종료하시려면 \"종료\" 라고 입력해주세요");
         
         // 유저 입력 받기
         Scanner sc = new Scanner(System.in);
          String user = sc.nextLine();
          
          // 게임 종료 처리
          if( user.equals("종료") ) {
             break;
          }
         
         // 컴퓨터 손 정하기
          int random = (int) (Math.random() * 3 + 1);
          String com = "";
          if(random == 1) {
             com = "가위";
          }else if(random == 2) {
             com = "바위";
          }else if(random == 3) {
             com = "보자기";
          }else {
             com ="컴퓨터 손 관련 에러발생 !!! 잘못된 숫자 ...";
          }
          
          // 각각의 손 출력
          System.out.println("당신 : " + user);
          System.out.println("상대 : " + com);
         
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
      
      System.out.println("승 : " + winCnt);
      System.out.println("무 : " + drawCnt);
      System.out.println("패 : " + loseCnt);
       

   }//main

}//class
















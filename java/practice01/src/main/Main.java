package main;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      System.out.println("======= 제어문 연습(가위 바위 보) ======");
      
      // 1. 유저 입력 받기. (1: 가위, 2: 바위, 3: 보자기)
      // 2. 컴퓨터 값 랜덤으로 정하기.
      // 3. 판단하고 결과를 출력하기.
      
      System.out.println("1: 가위, 2: 바위, 3: 보자기 중 하나를 입력 하세요.");
      Scanner sc = new Scanner(System.in);
      int user = sc.nextInt();
      
      int com = 3;
      
      if(com == 3 && user == 1 || com == 1 && user == 2 || com==2 && user==3) {
         System.out.println("유저 승리 ! ");
      }else if(com == 1 && user == 3 || com == 2 && user == 1 || com==3 && user==2) {
         System.out.println("유저 패배... ");
      }else if(com == 1 && user == 1 || com == 2 && user == 2 || com==3 && user==3) {
         System.out.println("무승부");
      }else {
         System.out.println("잘못된 입력 입니다.");
      }
   }
}
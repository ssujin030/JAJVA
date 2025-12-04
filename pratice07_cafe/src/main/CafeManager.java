package main;

import java.util.Scanner;

public class CafeManager {
	//메뉴판 출력

	Scanner sc= new Scanner(System.in);
	int menu01Cnt;
	int menu02Cnt;
	int menu03Cnt;
	
	public void printMenu() {
		System.out.println("1.아메리카노(1000원)");
		System.out.println("2.아이스티(2000원)");
		System.out.println("3.초코라떼(3000원)");
	}	
	//주문 받기(메뉴번호, 수량)
	public void order () {
		System.out.println("메뉴 번호 : ");
		int menuNum= sc.nextInt();
		System.out.println("메뉴 갯수 : ");
		int menuCnt= this.sc.nextInt();
		
		switch(menuNum){
		case 1:menu01Cnt=menuCnt;break;
		case 2:menu02Cnt=menuCnt;break;
		case 3:menu03Cnt=menuCnt;break;
		default :System.out.println("잘못");
		}
	}
	
	
	
	//주문서 출력
	public void printOrder() {
		System.out.println("1번메뉴는 잔"+ menu01Cnt+"입니다");
		System.out.println("2번메뉴는 잔"+ menu02Cnt+"입니다");
		System.out.println("3번메뉴는 잔"+ menu03Cnt+"입니다");

		int totalPrice = menu01Cnt * 1000 + menu02Cnt*2000 +menu03Cnt*3000;
		System.out.println("총금액은:" + totalPrice+"원입니다.");		 
	}

	

}

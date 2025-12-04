package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int menu01price = 1000;
		int menu02price = 2000;
		int menu03price = 3000;
		
		
		int menu01cnt=0;
		int menu02cnt=0;
		int menu03cnt=0;
		
		System.out.println("--------STARBUCKS----------");
		
		int totalPrice=0;
		while(true) {
			//메뉴판 (메뉴이름, 가격)
			System.out.println("0. 결제하기");
			System.out.println("1.아메리카노"+  menu01price);
			System.out.println("2.아이스티 "+  menu02price);
			System.out.println("3.초코라떼 "+  menu03price);
			
			
			//메뉴 선택(메뉴번호, 수량)
	        Scanner sc = new Scanner(System.in);
	        System.out.println("메뉴번호: ");
	        int menuNum = sc.nextInt();
	        
	      //0번 선택하면, 반복문 그만
	        if(menuNum == 0){
	        	break;
	        }
	        System.out.println("메뉴수량: ");
	        int menuCnt = sc.nextInt();
	        
	       
	        //결제 금액 계산
	        int menuPrice = 0;
	        switch(menuNum) {
	        case 1: menuPrice = menu01price; 
	        		menu01cnt+=menuCnt;
	        		break;
	        case 2: menuPrice = menu02price;
	         		menu02cnt+=menuCnt;
	        		break;
	        case 3: menuPrice =  menu03price;
	        		menu03cnt+=menuCnt;
	        		break;
	        default : System.out.println("잘못된 메뉴 번호");
	        }
	        totalPrice += menuPrice * menuCnt;
		}//while
        
		//전체 금액 안내
		System.out.println("아메리카노"+ menu01cnt +"잔");
		System.out.println("아이스티" + menu02cnt +"잔");
		System.out.println("초코라떼" + menu03cnt +"잔");;
	
		
        System.out.println("결제하실금액은" +totalPrice +"입니다");

	}

}

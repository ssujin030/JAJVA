package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("======CAFE");
		
		//객체생성
		CafeManager cafeManger =new CafeManager();
		
	
			//메뉴판 출력
			
			cafeManger.printMenu();

			
			
			//주문 받기(메뉴번호, 수량)
			cafeManger.order();
		}
		
		
		
		//주문서 출력
		cafeManger.printOrder();
	
	
	}//main

}

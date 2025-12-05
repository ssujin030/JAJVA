package review07;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {

System.out.println("===============cafe=================");
		
		
		//객체생성
	
				
		//메뉴판 출력	
		team cafe=new team();
		cafe.menu();				
		
		//주문 받기(메뉴번호, 수량)
		cafe.order();
		

		//주문서 출력
		cafe.submit();

	}

}

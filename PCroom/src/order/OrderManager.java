package order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
	
	
	ArrayList<OrderVo> order = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	public void order() {
		menuorderprint();
		int num = numbercheck();
		excute(num);
	
	}

public void menuorderprint() {
	System.out.println("메뉴를 선택해주세요");
	System.out.println("1.짜계치");
	System.out.println("2.해장 라면");
	System.out.println("3.닭껍질 튀김");
	System.out.println("4.감자튀김");
	System.out.println("5.아이스티");
}

public int numbercheck() {
	System.out.println("번호를 입력해주세요");
	int num=sc.nextInt();
	return num; 	
}

public void excute(int num) {
	switch(num) {
	case 1:menu1();break;
	case 2:menu2();
	case 3:menu3();
	case 4:menu4();

	
	}
}
	
	
	public void menu1() {
		System.out.println("짜계치를 선택하셨습니다.");
	}
	
}




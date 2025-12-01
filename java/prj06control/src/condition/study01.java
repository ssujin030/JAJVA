package condition;

import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//지하철 요금 판단
		
		//7세 미만 공짜22
		
		//8~19세 1000원
		//20~65세 2000원
		
		//65세 공짜
		
		System.out.print("나이를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		int price = 0;
		
		
		if(age < 7) {
		}
		else if(age <= 19) {
			price = 1000;
		}else if(age <= 65) {
			price = 2000;
		}else {
		}
		
		
		System.out.println("당신의 지하철 요금은 " + price+ " 원 입니다.");
		
		
		

		
		
	}

}
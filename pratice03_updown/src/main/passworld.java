package main;

import java.util.Scanner;

public class passworld {

	public static void main(String[] args) {
		int count=4;
		System.out.println("비밀번호를 입력해주세요 4 자리");
		System.out.println("남은 횟수:"+(count));
		// 입력값 받기	
		
        //패스워드 값
        int passworld= 1234;
				
		//기회는 5번
		

		while(count>0) { 
			
			Scanner sc = new Scanner(System.in);
	        int user = sc.nextInt();
			System.out.println("남은 횟수:"+(count-1));
	
			count--;
 
        
        
        if(user==passworld) {
        	System.out.println("정답입니다.");
        	break;
        }else {
        	System.out.println("다시 입력해주세요");
        }
        
        
        }if(count==0){
        	System.out.println("계정 정지! 10분뒤 다시 시도해주세요");}
       

	}

}

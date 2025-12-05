package main;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//도전 횟수
		int count=0;
		count = 7;		
        //랜덤값 만들기
        int random =(int)(Math.random()*100+1);
		
        //정답여부   
        boolean line = false;
      
			while(count>0) {	//남은 도전 홧수 안내
		        System.out.println("count:"+count);
	
						
				//유저 숫자 입력 받기
				System.out.print("1~100 사이의 숫자 입력:");
		        Scanner sc = new Scanner(System.in);
		        int user = sc.nextInt();
		        count--;

				//업다운 판단하기
		        
		        if(user>random) {
		        	System.out.println("down");
		        }else if(user<random){
		        	System.out.println("up");
		      
		        }else {
		        	System.out.println("정답");
		        	line =true;
		        	break;
		        	
		        }
				
			
	
	} System.out.print("게임종료");
	if(!line) {
		System.out.println("랜덤값:"+ random);
	}

}
}

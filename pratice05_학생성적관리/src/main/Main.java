package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("====== 학생 성적 관리 ====");
		
		
	//학생 5명 성적 입력받고, 출력하기
	Scanner sc = new Scanner(System.in);
	
	
	//학생 수 설정
	System.out.print("학생수:");
	int studentCnt = sc.nextInt();
	byte[]studentArr = new byte[studentCnt];
	
	
	//학생 성적 입력
	for(int i = 0;i<studentArr.length;++i) {
		System.out.print(i+1 +"학년 학생 성적:");
		studentArr[i] = sc.nextByte();
	
	}
	
	//=====================================
	while(true) {
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 전체학생 성적 출력");
		System.out.println("2. 총합 출력");
		System.out.println("3. 평균 출력");
		System.out.println("4. 학생 한명 성적 출력");
		int num = sc.nextInt();
		
		if(num==0) {
			break;
		}
		
		if(num==1) {
			//전체학생 성적 출력
			for(int i=0;i< studentArr.length; ++i) {	
				System.out.println(i+1 +"번 학생 성적:"+studentArr[i]);
			
			}
			
		}else if(num ==2) 
		{	// 학생 성적 합계 출력
			int sum=0;
			for(int i=0; i<studentArr.length;i++) {
				sum += studentArr[i];
			}
			System.out.println("성적합계 출력:"+sum);	
		}else if(num ==3) {
		//학생 성적 평균 출력	
			int sum=0;
			for(int i=0; i<studentArr.length;i++) {
				sum += studentArr[i];
			}
			double avg=(double)sum / studentCnt;
			System.out.println("평균:" + avg);
			}//학생 한명 성적 출력
			else if(num ==4) {
				System.out.print("성적 확인하고 싶은 학생 번호");
				int stdNum=sc.nextInt();
				System.out.println(studentArr[stdNum-1]);
		}else 
		{
			System.out.println("잘못된 번호 입니다.");
		}
		
	}System.out.println("종료되었습니다");
	
	
	


	

	
	
	}
}
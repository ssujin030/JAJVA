package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * [배열] : 타입이 동일한 변수 여러개 한번에 관리
		 * 
		 * [문법]
		 * 타입[] 변수명 = 배열;
		 * int[] x = new int[3];
		 */
		
		
		System.out.println("=======AREA=======");
		
		int[] a = new int[5];
		
		
		
		for(int i =0;i<5; ++i) {
			a[i]=(i+1)*10;		
		}
							
		for(int i=0; i<5; ++i) {
			System.out.println(a[i]);
			
			
			
		}
		
		

		
		
	}//main

}//class

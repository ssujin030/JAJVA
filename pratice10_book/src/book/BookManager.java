package book;

import java.util.Scanner;

public class BookManager {
	
	//입력을 위한 스캐너
	
	Scanner sc = new Scanner(System.in);
	
	//도서 정보 등록을 위한 저장공간
	private BookVo[] arr = new BookVo[100];
	
	private int cnt = 0;
	
	//프로그램 실행
	public void programStart(){ 
		
		while(true) {
			printMenu();
			//숫자 받기;
		  int num = scanNumber();
		  if(num==0){break;} {
			//기능 수행
		  executeFuction(num);
		  }
		
			
		}
		
	}
	private void executeFuction(int num) {
		switch(num) {
		case 1:insert();break;
		case 2:selectList();break;
		case 3:selectOne();break;
		case 4:update();break;
		case 5:delete();break;
		default : System.out.println("잘못된 번호 입니다.");
		}
		
	}
	
	private int scanNumber() {
		System.out.print("원하는 메뉴 번호: ");
		int num =sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	private void printMenu() {
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서 목록 조회");
		System.out.println("3. 도서 상세 조회");
		System.out.println("4. 도서 수정");
		System.out.println("5. 도서 삭제");
		
	}
	
	
	
	//도서 등록	
	public void insert() {
		System.out.println("\n\n----도서 등록----");
		
		System.out.println("도서제목: ");
		String x =sc.nextLine();
		System.out.println("도서가격: ");
		int y = sc.nextInt();
		sc.nextLine();
		arr[cnt] = new BookVo(x, y);
		cnt++;
		System.out.println("도서 등록 완료!");
	}
	
	//도서 목록 조회	
	public void selectList() {
		System.out.println("\n\n----도서 목록 조회-----");
		
		System.out.println("title / price");
		for (int i=0; i< cnt; i++) {
			System.out.print(arr[i].getTitle());
			System.out.print("/");
			System.out.print(arr[i].getPrice());
			System.out.println();
			
		}
	}
	
	//도서 단건 조회
	public void selectOne() {
		System.out.println("=====도서단건 조회=====");
		for (int i=0; i< cnt; i++) {
			System.out.print(i+1+".");
			System.out.println(arr[i]);
		}
  	
		System.out.println("=====책번호를 입력해주세요=====");
		int num=sc.nextInt();
			System.out.println(arr[num-1].toString());}
	
	//도서 삭제
	public void delete() {}
	
	//도서 수정
	public void update() {}
	
}

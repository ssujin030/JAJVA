package book;

import java.util.Scanner;

public class BookManager {
	
	
	private int cnt =0;
	
	//입력도구
	Scanner sc=new Scanner(System.in);
	
	//저장소
	private BookVo[] arr =new BookVo[100];
	
	//프로그램 실행
	public void startProgram() {
		while(true) {
			printMenu();
			int num = scanNumber();
			if(num==0) {break;}
			executeFunction(num);
		}
	}
	
	private void printMenu() {
		System.out.println("------MENU------");
		System.out.println("0.프로그램 종료");
		System.out.println("1.도서 등록");
		System.out.println("2.도서 목록 조회");
		System.out.println("3.도서 상세 조회");
		System.out.println("4.도서 수정");
		System.out.println("5.도서 삭제");
		
	}
	
	
	private int scanNumber() {
		System.out.println("메뉴 번호 입력 : ");
		return Integer.parseInt(sc.nextLine()); 
	}
	
	
	private void executeFunction(int num) {
		switch(num) {
		case 1:insert();break;
		case 2:selsecList();break;
		case 3:selectOne();break;
		case 4:update();break;
		case 5:delete();break;
		default:System.out.println("잘못된 번호입니다.");
		}
		
	}
	
	
	
	
	
	//도서등록@@
	private void insert() {
		
		System.out.println("\n ====도서등록====");
		System.out.print("도서제목: ");
		String title = sc.nextLine();
	    System.out.print("도서가격: ");
		int price = Integer.parseInt(sc.nextLine());

		BookVo vo = new BookVo(title,price);
		arr[cnt]=vo;
		
	}
	
	
	
	
	//도서조회(단건)
	private void selectOne() {
		System.out.println("\n-----도서단건 조회------");
		
		System.out.println("조회할 도서 번호 :");
		int num = Integer.parseInt(sc.nextLine() );
		System.out.println("도서제목 : "+ arr[num].getTitile());
		System.out.println("도서가격 : "+ arr[num].getPrice());
	}
	
	//도서조회(전체)
	private void selsecList() {
		System.out.println("\n-----도서목록 조회------");
		
		System.out.println("도서제목 / 도서가격");
		for(int i=0;i<cnt;i++) {
			if(arr[i]==null) {continue;}
			System.out.print(i+arr[i].getTitile());
			System.out.print("/");
			System.out.print(i+arr[i].getPrice());
			System.out.println();
		}
	}
	
	//도서수정
	private void update() {
		System.out.println("\n=====도서 수정=====");
		System.out.print("수정할 도서 번호: ");
		int num = Integer.parseInt(sc.nextLine());
		BookVo x = arr[num];
		if(x==null) {
            System.out.println("해당코드는 존재하지않습니다.");
            return;
		}
		System.out.print("수정할 도서 제목: ");
		String title = sc.nextLine(); 
		System.out.print("수정할 도서 가격: ");
		int price = Integer.parseInt(sc.nextLine()); 
		
		x.setTitile(title);
		x.setPrice(price);
		System.out.println("도서 수정완료");
		//arr[num].setTitile(title);
		//arr[num].setPrice(price);
		
	 }//update
		
	
	//도서삭제
	private void delete() {
		System.out.println("\n======도서삭제======");
		System.out.println("삭제할 도서 번호 :");
		int num = Integer.parseInt(sc.nextLine());
		arr[num]=null;
		
		
		System.out.println("도서 삭제 완료 !");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}//class

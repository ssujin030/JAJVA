package book;

import java.util.Scanner;

public class BookManager {

	//입력도구
	Scanner sc= new Scanner(System.in);
	
	//저장소
	private BookVo [] arr = new BookVo [100];
	
	private int cnt=0;
	
	//프로그램 실행
	public void programstart() {
	   while(true){
	programmanu();
	int num = scanernumber();
	if(num==0) {break;}
	executeFunction(num);
		}
	}
	
	private void programmanu() {
		System.out.println("0. 프로그램 종료 하기");
		System.out.println("1. 도서 등록하기");
		System.out.println("2. 도서 조회하기(전체)");
		System.out.println("3. 도서 조회하기 (단건)");
		System.out.println("4. 도서 수정하기");
		System.out.println("5. 도서 삭제하기");
	}
	
	private int scanernumber() {
		System.out.println("번호를 입력해주세요");
		
		int num=Integer.parseInt(sc.nextLine());
		return num;
		  
	}
	
	private void executeFunction(int num) {
		switch(num){
		case 1: insert();break;
		case 2: selsecList();break;
		case 3: selsecOne();break; 
		case 4: upDate();break;
		case 5: delete();break;
		}
	}
	
 
	//도서등록@@
	private void insert() {
		System.out.println("=========책 등록========");
		System.out.println("책이름을 입력해주세요");
		String title = sc.nextLine();
		System.out.println("책 가격을 입력해주세요");
		int price = Integer.parseInt(sc.nextLine());	
		BookVo vo = new BookVo(title,price);
		arr[cnt]=vo;				
		cnt++;
	}
	
	
	//도서조회(전체)
	private void selsecList() {
		System.out.println("=====도서를 조회======");
		for(int i=0; i<cnt; ++i) {
			if(arr[i]==null) {continue;}
			System.out.print(i+arr[i].getTite());
			System.out.print("/");
			System.out.print(i+arr[i].getPrice()+"\n");
		
		}
	}
	
	//도서조회(단건)
	private void selsecOne() {
		System.out.println("======도서 단건 조회=======");
		System.out.println("찾으시는 책의 번호를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print(num+arr[num].getTite());
		System.out.print(num+arr[num].getPrice()+"\n");			
	}
	
	//도서 수정
	private void upDate() {
		System.out.println("=====도서 수정=====");
		System.out.println("수정하실책의 번호를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		BookVo x = arr[num];
		System.out.println("책의 이름:");
		String title = sc.nextLine();
		System.out.println("책의 가격:");
		int price = Integer.parseInt(sc.nextLine());
		x.setTite(title);
		x.setPrice(price);
		System.out.println("도서 수정완료");
	
	}
			
	//도서삭제
	
	private void delete() {
		System.out.println("====도서 삭제====");
		System.out.println("삭제하실 도서 번호를 입력해주세요");
		int num = Integer.parseInt(sc.nextLine());
		arr[num]=null;
		System.out.println("삭제 되었습니다.");
		
		
	}
		
}

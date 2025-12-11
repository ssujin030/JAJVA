package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
   
   //입력도구
   private Scanner sc = new Scanner(System.in);
   
   //저장소 (ArrayList)
   private ArrayList<BookVo> voList = new ArrayList<>(); 
   
   //프로그램 실행
   public void startProgram() {
      System.out.println("===== 도서 관리 프로그램 =====");
      
      while(true) {
      printMenu();
      int num = scanNumber();
      if(num == 0) {return;}
      executeFunction(num);
   }
      }
   
   //메뉴 출력
   private void printMenu() {
      System.out.println("\n---- MENU -----");
      System.out.println("0. 프로그램 종료");
      System.out.println("1. 도서 등록");
      System.out.println("2. 도서 목록조회");
      System.out.println("3. 도서 상세조회");
      System.out.println("4. 도서 수정");
      System.out.println("5. 도서 삭제");
   }
   
   //메뉴번호 입력받기
   private int scanNumber() {
      System.out.print("메뉴 번호 : ");
      return Integer.parseInt(sc.nextLine());
   }
   
   //선택한 메뉴번호에 따른 기능 실행
   private void executeFunction(int num) {
      switch(num) {
      case 1 : insert(); break;
      case 2 : selectBookVoList(); break;
      case 3 : selectBookVoOne(); break;
      case 4 : update(); break;
      case 5 : delete(); break;
      default : System.out.println("잘못된 번호입니다.");
      }
   }
   
   //도서 등록 (Create)
   private void insert() {
      System.out.println("----- 도서 등록 -----");
      
      System.out.print("제목 : ");
      String title = sc.nextLine();
      System.out.print("가격 : ");
      int price = Integer.parseInt(sc.nextLine());
      
      BookVo vo = new BookVo(title, price);
      
      voList.add(vo);
      
      System.out.println("도서 등록 완료 !");
   }
   
   //도서 목록조회 (Read)
   private void selectBookVoList() {
      System.out.println("----- 도서 목록조회 -----");
      
      for(int i = 0; i < voList.size(); ++i) {
         System.out.print( voList.get(i).getTitle() );
         System.out.print("/");
         System.out.print( voList.get(i).getPrice()+"\n" );
      }
   }
   
   //도서 상세조회 (Read)
   private void selectBookVoOne() {
      System.out.println("----- 도서 상세조회 -----");
      
      System.out.print("조회할 도서번호: ");
      int n = Integer.parseInt(sc.nextLine());
      
      System.out.println(voList.get(n));
   }
   
   //도서 수정 (Update)
   private void update() {
      System.out.println("----- 도서 수정 -----");
      
      
      System.out.println("수정할 도서 번호:");
      int n = Integer.parseInt(sc.nextLine());
      
      if(n >= voList.size()) {
    	  System.out.println("해당도서는 존재하지않습니다.");
    	  return;
      }
      System.out.print("수정할 도서 제목 :");
      String x = sc.nextLine();
      System.out.print("수정할 도서 가격 :");
      int y = Integer.parseInt(sc.nextLine());
      
      BookVo vo = voList.get(n);
      vo.setTitle(x);
      vo.setPrice(y);
      
      System.out.println("도서 수정 완료!");
   }
   
   //도서 삭제 (Delete)
   private void delete() {
      System.out.println("----- 도서 삭제 -----");
      
      System.out.print("삭제할 도서 번호 :");
      int n = Integer.parseInt(sc.nextLine());
      
      voList.remove(n);
      System.out.println("도서 삭제 완료! ");
   }
   
   

}//class









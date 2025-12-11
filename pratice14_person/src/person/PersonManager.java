package person;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	//scanner
  private Scanner sc	= new Scanner(System.in);
	//ArrayList
  private ArrayList<PersonVo> voList = new ArrayList<>();
	
	//process
 	public void startProgram() {
 		System.out.println("=======연락처 관리=======");
 		
 		while(true) {
 		printMenu();
 		int num = sanNumber();
 		if(num==0) {return;}
 		executeFuntion(num);
 		
 		}
 	}
	//printMenu
  	public void printMenu() {
  		System.out.println("0. 프로그램 종료");
  		System.out.println("1.연락처 등록");
  		System.out.println("2.연락처 목록 조회");
  		System.out.println("3.연락처 상세조회");
  		System.out.println("4. 연락처 수정");
  		System.out.println("5. 연락처 삭제");
  		
  	}
	//scanNumber
  	public int sanNumber() {
  		System.out.print("번호를 입력해 :");
  		return Integer.parseInt(sc.nextLine());
  	}
	//executeFuntion
 	 public void executeFuntion(int num){
 		 switch(num) {
 		 case 1:insert();break;
 		 case 2:selectList();break;
 		 case 3:selectOne();break;
 		 case 4:update();break;
 		 case 5:delete();break;
 		 default: System.out.println("잘못된 번호 입니다.");
 		 }
 	 }
	
	//insert
 	 public void insert(){
 		 System.out.println("-------연락처 등록------");
 		System.out.print("이름 입력:");
 		String name = sc.nextLine();
  
 		System.out.print("번호 입력:");
 		String phone = sc.nextLine();
 		
 		 PersonVo vo = new PersonVo(name,phone);
 		 voList.add(vo);
 		 
 		 System.out.println(name +"의 연락처 등록 완료!!");
 		 
 	 }
	//selectList
 	 public void selectList() {
 		 System.out.println("--------연락처 목록 조회------");
 		 
 		 for(int i=0;i<voList.size();i++) {
 			 System.out.print(voList.get(i).getName());
 			System.out.print("/");
 			System.out.print(voList.get(i).getPhone());
 			 System.out.println();
 		 }
 		 
 	 }
	//selectOne
 	 public void selectOne(){
 		System.out.println("\n--------연락처 상세 조회------");
 		
 		System.out.print(" 조회할 사람 번호: ");
 		int n= Integer.parseInt(sc.nextLine());
 		System.out.print(voList.get(n));
 		 
 	 }
	//update
 	 public void update(){
 		System.out.println("--------연락처 수정------");
 		
 		System.out.print("수정할 사람 번호 :");
 		
 		int n= Integer.parseInt(sc.nextLine());
 		
 		if(n >=voList.size()) {
 			System.out.println("잘못된 번호입니다.");
 			return;
 		}
 		System.out.print("수정할 이름: ");
 		String name = sc.nextLine();
 		System.out.print("수정할 번호: ");
 		String phone =sc.nextLine();
 		
 		PersonVo vo = voList.get(n);
 		vo.setName(name);
 		vo.setPhone(phone);
 		 
 	 }
	//delete
 	 public void delete(){
 		System.out.println("--------연락처 삭제------");
 		
 		System.out.println("삭제할 연락처 번호를 입력해주세요");
 		int n= Integer.parseInt(sc.nextLine());
 		voList.remove(n);
 		
 		System.out.println("삭제가 완료되었습니다.");
 		 
 	 }

}

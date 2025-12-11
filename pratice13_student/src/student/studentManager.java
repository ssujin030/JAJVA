package student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
	
	//input
	private Scanner sc =new Scanner(System.in);
	
	//repository
	ArrayList<studentvo> voList =new ArrayList<>();
	
	//process
	public void startProgram() {
		//menu
		//scan num
		//executeFuntion
		
		
		while(true) {
		printMenu();
		int num = scanNumber();
		if(num==0) {return;}
		executeFuntion(num);
	}
		}
	
	public void printMenu() {
		System.out.println("\n---------MENU-------------");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 목록 조회");
		System.out.println("3. 학생 정보 상세 조회");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
	}
	
	public int scanNumber() {
	    System.out.println("메뉴번호 :");
		return Integer.parseInt(sc.nextLine());
	}
	
	public void executeFuntion(int num) {
		switch(num) {
		case 1:insert();break;
		case 2:selectList();break;
		case 3:selectOne();break;
		case 4:update();break;
		case 5:delete();break;
		default: System.out.println("잘못된 번호입니다.");
		}
		
	}
	//create
	public void insert() {
		System.out.println("------학생 정보 등록--------");
		System.out.print("학생 이름: ");
		String name = sc.nextLine();
		System.out.print("학생 점수: ");
		int score = Integer.parseInt(sc.nextLine());
		studentvo vo = new studentvo(name,score); 
		voList.add(vo);
		System.out.println("정보 등록 완료");
		
	}
	
	
	//read-all
	public void selectList() {
		System.out.println("------학생 정보 목록 조회--------");
		
		System.out.println("이름/성적");
		for(int i=0; i<voList.size(); i++) {
			System.out.println(voList.get(i).getName());
			System.out.println("/");
			System.out.println(voList.get(i).getScore()+"\n");
		}
					
	}
	//read-one
	public void selectOne() {
		System.out.println("------학생 정보 상세 조회--------");
		
		System.out.print("조회할 학생번호 :");
		int n =Integer.parseInt(sc.nextLine()); 
		
		System.out.println(voList.get(n));
		
	}
	
	//update
	public void update() {
		System.out.println("------학생 정보 수정--------");
		
		System.out.print("수정할 학생 번호: ");
		int n =Integer.parseInt(sc.nextLine()); 
		
		if(n>=voList.size()) {
			System.out.println("그런 학생은 없습니다.");
			return;
		}
		System.out.print("수정 할 이름:");
		String name = sc.nextLine();
		System.out.print("수정 할 점수:");
		int Score = Integer.parseInt(sc.next());
		
		studentvo vo = voList.get(n);
		vo.setName(name);
		vo.setScore(Score);
		
	}
	
	//delete
	public void delete() {
		System.out.println("------학생 정보 삭제--------");
		
		int n = Integer.parseInt(sc.next());
	
		voList.remove(n);
		
	}
}

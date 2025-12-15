package pcroom;

import java.util.Scanner;

public class PcManager {
	

	
	//pc방 자리 배석 공간
	PcseatVo [] seat = new PcseatVo[100];
	Scanner sc = new Scanner(System.in);
	
	
	public void menu() {
		System.out.println("=====Lucky Vicky pc room =========");
		while(true) {
		printsart();
		int num = numberstore();
		if(num==0) {return;}
		excute(num);
		}		
	}
	
	public void printsart() {
		System.out.println("0. 프로그램 종료하기");
		System.out.println("1.좌석 선택하기");
		System.out.println("2.좌석 이동하기");
		System.out.println("3.시간 충전 하기");
		System.out.println("4.좌석 종료하기");

	}
	
	public int numberstore() {
		System.out.print("번호 입력 :");
		return sc.nextInt();
	}
	
	public void excute(int num) {
		switch(num){
		case 1:seatselect();break;
		case 2:move();break;
		case 3:time();break;
		case 4:clear();break;
		default: System.out.println("잘못된 번호입니다.");
		}
	}
	
	
	//유저가 좌석 선택하기
	
	public void seatselect() {
		seatList();
	    System.out.println("사용하실 좌석을 선택해 주세요(1~100)");
	    System.out.print("번호 입력 :");
	    int num = sc.nextInt();

	    if (num < 1 || num > 100) {
	        System.out.println("존재하지 않는 좌석입니다.");
	        return;
	    }

	    if (seat[num-1] == null) {   // ⭐ index 주의
	        seat[num-1] = new PcseatVo();
	        seat[num-1].setSeatNo(num);
	        seat[num-1].isUsing = true;
	        seat[num-1].remainTime = 0;

	        System.out.println(num + "번 좌석 사용 시작!");
	    } else {
	        System.out.println("이미 사용 중인 좌석입니다.");
	    }
	}

	
    //시간충전하기
	public void time() {
		System.out.println("충전할 좌석을 선택해주세요");
		System.out.print("좌석 번호 :");
		int num = sc.nextInt();
	    if (seat[num-1] == null) {
	        System.out.println("해당 좌석은 없는 자리입니다..");
	        return;
	    }
		System.out.print("충전할 시간(분): ");
		int time = sc.nextInt();
		seat[num-1].giveTime(time);
		System.out.println( num + "번 좌석에 " + time + "분 충전 완료!" );
	

	}
	//좌석 이동하기
	
		public void move() {
		    seatList();
		    System.out.print("현재 좌석 번호: ");
		    int num = sc.nextInt();
		    if (seat[num-1] == null) {
		        System.out.println("해당 좌석은 없습니다..");
		        return;
		    }
		    System.out.print("이동할 좌석 번호: ");
		    int n = sc.nextInt();

		    if (seat[n-1] != null) {
		        System.out.println("이동할 좌석은 이미 사용 중입니다.");
		        return;
		    }

		    // ⭐ 객체 이동 (핵심)
		    seat[n - 1] = seat[num - 1];   // 객체 복사
		    seat[n - 1].setSeatNo(n);      // 좌석 번호 변경
		    seat[num - 1] = null;           // 원래 자리 비우기


		    System.out.println(num + "번 → " + n + "번 좌석 이동 완료!");
		}


	

	
	// 사용중인 좌석 조회
	public void seatList() {
	System.out.println("=========현재 사용중인 좌석입니다.============");
	    for (int i = 0; i < seat.length; i++) {
	        if (seat[i] != null) {
	            System.out.println(
	                "좌석 번호: " + seat[i].seatNo +
	                " | 남은 시간: " + seat[i].remainTime
	            );
	        }
	    }
		 
	    
}
	
	//좌석 삭제 이용 끝내고 집에가기
	public void clear() {
		System.out.println("종료하실 좌석을 선택해주세요");
		System.out.print("번호 입력 :");
		int n = sc.nextInt();
		seat[n-1] = null;
		
			System.out.println(n +"번 자리가 종료되었습니다.");
	
		
	}
	
	
}


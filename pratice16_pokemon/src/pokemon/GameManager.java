package pokemon;

import java.util.Random;
import java.util.Scanner;

public class GameManager {
	
	private Scanner sc = new Scanner(System.in);
	
	private Pokemon user;
	private Pokemon com;
	private String result = null;
	//게임 진행
	
	public void gameStart() {
		System.out.println("======pokemon=======");
		
		//유저포켓몬 선택
		setUserPokemon();
		//컴퓨터 포켓몬
		setComsPokemon();
		
		//배틀시작
		battleStart();
	}	
		

	
	private void printPokemonList() {
		System.out.println("1.피카츄");
		System.out.println("2. 파이리");
		System.out.println("3. 꼬부기");

	}
	
	private void setUserPokemon() {
		printPokemonList();
		System.out.println("번호 입력 : ");
		int num= Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:user =new Pikachu();break;
		case 2:user =new Lizard();break;
		case 3:user =new Turtle();break;
		default :System.out.println("잘못된 번호입니다.");
	
		}
		
		
		
	}
	
	
	
	
	public void setComsPokemon() {
		
		int num=(int)(Math.random()*3+1);
		switch(num) {
		case 1: com =new Pikachu();break;
		case 2: com =new Lizard();break;
		case 3: com =new Turtle();break;
		default :System.out.println("잘못된 번호입니다.");
	
	}

}

	private void battleStart() {
		System.out.println("-----BATTLE------");
		
		while(true) {
			userTurn();
			if(result != null) {break;}
			comTurn();
			if(result != null) {break;}
	
	}
		} 
	
	private void printActions() {
		System.out.println("1.몸통 박치기");
		System.out.println("2.스킬");
		System.out.println("3.도망가기");
		
	}
	private String scanNumber() {
		System.out.println("번호 선택 :");
		return sc.nextLine();
	}
	
	private void calcDamage(String userAction, Pokemon a, Pokemon b) {
		//데미지 적용
		int damage=a.getAtk() - b.getAtk();
		damage *=Integer.parseInt(userAction);
		b.setHp(b.getHp()-damage);
		
		switch(userAction) {
		case "1": a.bodyTackle();break;
		case "2": a.skill();break;
		}
		
		System.out.println("데미지 :"+ damage);
		System.out.println(b.getName() +"의 남은 체력 :"+b.getHp());
		
		if(b.getHp() <=0) {
			result = a.getName() + "승리!!!";
		}
		
	
	}
	
	
	
	private void userTurn() {
		printActions();
		String userActions = scanNumber();
		calcDamage(userAction, user,com);
	}
		

	private void comTurn() {
		int random=(int)(Math.random()*2+1);
		String comAction = String.valueOf(Random);
		calcDamage(comAction);
		
	}
		
	
	

}












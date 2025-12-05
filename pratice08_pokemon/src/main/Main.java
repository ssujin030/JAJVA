package main;

import java.util.Scanner;

import pokemon.manager.BattleManager;
import pokemon.manager.GameManager;
import pokemon.mob.Pokemon;

public class Main {
	
	public static Pokemon UserPokemon;
	public static Pokemon compokemon;

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//프로그램에 필요한 객체들 준비
		GameManager gm=new GameManager();
		BattleManager bm=new BattleManager();
		
		
		
		// 포켓몬 생성					
		//포켓몬 목록 보여주기
		gm.printPokemon();
		
		
		//유저가 포켓몬 하나 고르기
		gm.selectUserPokemon();
		
		
		
		//컴퓨터의 포켓몬 랜덤으로 정하기
		gm.selectCompokemon();
		
		System.out.println(Main.UserPokemon.getName());
		System.out.println(Main.compokemon.getName());
		
		//베틀진행
		bm.battleStart();

	}

}

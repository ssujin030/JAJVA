package pokemon.manager;

import main.Main;
import pokemon.mob.Pokemon;

public class GameManager {

   //멤버 변수
   Pokemon[] pokemonArr = new Pokemon[3];
   int num;

  //  Bag x= new Bag();
	//x.brand="샤넬";
   //배열 생성int[] x = new int[3]
   
   //포켓몬들 생성
   public void generatePokemon() {
      pokemonArr[0] = new Pokemon();
      pokemonArr[1] = new Pokemon();
      pokemonArr[2] = new Pokemon();
      
      
      pokemonArr[0].setName("피카츄");
      pokemonArr[0].setHp(100);
      pokemonArr[0].setAtk(10);
      
      pokemonArr[1].setName("파이리");
      pokemonArr[1].setHp(90);
      pokemonArr[1].setAtk(11);
      
      pokemonArr[2].setName("꼬부기");
      pokemonArr[2].setHp(110);
      pokemonArr[2].setAtk(9);
      
   }
   
   //포켓몬들 정보 출력
   public void printPokemon() {
	   	  generatePokemon();
	      System.out.println("1 / " + pokemonArr[0].getName() + " / " + pokemonArr[0].getHp() + " / " + pokemonArr[0].getAtk());
	      System.out.println("2 / " + pokemonArr[1].getName() + " / " + pokemonArr[1].getHp() + " / " + pokemonArr[1].getAtk());
	      System.out.println("3 / " + pokemonArr[2].getName() + " / " + pokemonArr[2].getHp() + " / " + pokemonArr[2].getAtk());
	   }
   
   //유저가 포켓몬 하나 고르기
   public void selectUserPokemon() {
	   System.out.print("원하는 포켓몬 번호 :");
	   this.num= Main.sc.nextInt();
	   Main.UserPokemon = pokemonArr[num-1];

   }   
	      //컴퓨터의 포켓몬 랜덤으로 정하기

	   public void selectCompokemon () {
			Main.compokemon= pokemonArr[(num)%3];

			
   }
   
   

	}







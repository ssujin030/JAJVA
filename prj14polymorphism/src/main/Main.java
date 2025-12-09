package main;


import java.util.Scanner;

import Car.Avante;
import Car.Car;
import Car.Sonata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.아반떼");
		System.out.println("2.소나타");
		int num = sc.nextInt();
		
		Car x = new Avante() ;
		
		switch(num) {
		case 1: x = new Avante();	break;
		case 2: x = new Sonata();	break;
		default: System.out.println("잘못된 번호");
		}
		
		
	//	System.out.println(x);
		
		x.go();
		

	}
	

}


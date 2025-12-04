package codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 if (n > 0) {
	            System.out.println("plus");
	        } else {
	            System.out.println("minus");
	        }

	        // 2. 짝수/홀수 판별
	        if (n % 2 == 0) {
	            System.out.println("even");
	        } else {
	            System.out.println("odd");
	        }
	    }
	}
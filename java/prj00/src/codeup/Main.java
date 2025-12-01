package codeup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	if(a<b) {
    		for(int n=a; a<=b; n++) {
    			System.out.println(a+" ");
    		}
    		
    	}else if(a>b) {
    		
    		for(int n=b; b<=a; n++) {
    			System.out.println(b+" ");
    		}
    		
    	}
    	
    

    	}
    }
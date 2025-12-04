package codeup;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    	
    	
    	System.out.println("구구단");
    	
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        for(int dan=a;dan<=b;++dan) {
    	for(int i=1;i<=9;++i) {
    		System.out.println(a+"*"+i+"="+a*i);
    	}
    	
        }

    	}//main
    
    }//class
package main;

public class Test {
	
	public static int x;
	
	public static void m01() {
		System.out.println("m01 called~~");
		System.out.println(x); //static x아닌 그냥 public x면 참조되지 않는다.
		
	}

}

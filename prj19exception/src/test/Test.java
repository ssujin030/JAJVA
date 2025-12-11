package test;

public class Test {
	
	public void m01() {
		System.out.println("m01 called...");
		
		
		String x = null;
		
		try {
			System.out.println(3/0);
		}catch(Exception abc) {
			System.out.println("예외 터져서 캐치블럭이 잡음");
			
		}
		
		
		

	}

}

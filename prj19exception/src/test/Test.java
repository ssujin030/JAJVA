package test;

public class Test {
	
	public void m01()  {
		System.out.println("m01 start...");
		m02();
		System.out.println("m01 end");
		
	}
		
	public void m02()  {
			System.out.println("m02 start...");
			try {
				m03();
			}catch(ArithmeticException e) {
				System.out.println("m03 호출하다 에러발생...");
			}
			System.out.println("m02 end");
			m03();
			
			
	}
	public void m03()  {
				System.out.println("m03 start.");
				int x = 1/0;
				System.out.println("m03 end");

		
		
	
	}

}

package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class Test {
	
	public void test01() {
		ArrayList x = new  ArrayList();
		
		x.add("사과");
		x.add("딸기");
		x.add(123);
		x.add(3.14);
		x.add(true);
		
		x.remove(1);
		
		x.add(1,"오렌지");
	//	x.clear();
		
		System.out.println(x.size());
	
		
	}
	public void test02() {
		
		HashSet x = new HashSet();
		x.add("사과");
		x.add("사과");
		x.add("사과");
		x.add("사과");
		x.add("딸기");
		x.add(777);
		
		//x.clear();
		
		System.out.println(x.size());
	}
	public void test03() {
		HashMap x= new HashMap();
		x.put("일","사과");
		x.put("이","자두");
		x.put("삼","딸기");
		x.put(1,"김철수");
		x.put(2,"김수한무거북이와 두루미삼천감자동박삭치기카포너구리");
		x.put(2,"카리나");
		System.out.println(x);
		
		
	}
	public void test04() {	
		Stack x = new Stack();
		x.add("사과");
		x.add("딸기");
		x.add("배");
		
		System.out.println(x.pop());
		
	}
	public void test05() {
		
		LinkedList x = new LinkedList();
		
		x.offer("새우깡");
		x.offer("감자깡");
		x.offer("고구마깡");
		
		System.out.println(x.poll());
		
		
	}


}

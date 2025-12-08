package main;

public class Main {

	public static void main(String[] args) {
		
System.out.println("========Value Object=======");
		
//  Beverage z =new Beverage("아이스라떼",3000);	
//        System.out.println(z.toString());
//	    Beverage m =new Beverage();		
//	 	m.setName("아이스라떼");
//		m.setPrice(3000);
//		System.out.print("name:"+m.getName());
//		System.out.print("price:"+m.getPrice());

		 Computer com = new Computer("삼성",5000000);
		 System.out.println(com.toString());
		 
		 Phone phone = new Phone("apple","white","3000");
		 System.out.println(phone.toString());
		 
		 Person person = new Person("말뚝이",19,80,50);
		 System.out.println(person.toString());
		 
		 Student st = new Student("말뚝이",19,80,50,50,180,70,'M',false);
		 System.out.println(st.toString());
		 		
	}

}

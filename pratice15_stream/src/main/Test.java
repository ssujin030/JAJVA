package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	private File f = new File("D:\\dev\\test.txt");
	
	//유저한테 입력받은 내용을 파일에 저장하기
	public void m01() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 내용 :");
		String str = sc.nextLine();
		
		FileWriter fw= new FileWriter(f, true);
		fw.write(str +"\n");
		
		fw.close();
	}
	
	//파일 내용 읽어오기
	public void m02() throws Exception {
		FileReader fr= new FileReader(f);
		BufferedReader br =new BufferedReader(fr);
		
		while(true) {
		String str = br.readLine();
		if(str==null) {break;}
		
		
		String[] arr = str.split("/");
		
		String title=arr[0];
		int price=Integer.parseInt(arr[1]);  
		
		BookVo vo= new BookVo(title,price);
		System.out.println(vo);
		
		
		}
		
		br.close();
		
	}

}

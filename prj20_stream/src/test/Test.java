package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	
	//데이터 내보내기 테스트
	public void m01() throws IOException{
		//연결대상(파일객체) 준비
		File f =new File("D:\\dev\\hello.txt");
		//통로 준비
		FileWriter fw = new FileWriter(f, true);
		String num= sc.nextLine();
		//데이터 내보내기
		fw.write(num);
		//통로 정리
		fw.close();
	}
		
	//데이터 읽어오기 테스트
	public void m02() throws Exception {
		//연결 대상(파일 객체) 준비
		File f =new File("D:\\dev\\hello.txt");
		//통로 준비
		FileReader fr =new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//데이터 읽기
		String str = br.readLine();
		//통로 정리
		fr.close();

		

		
		
		
	}

}

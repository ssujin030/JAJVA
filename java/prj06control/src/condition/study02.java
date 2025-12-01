package condition;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
	
		// BMI 
		//~10정상
		//~20 과체중
		//~비만
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm):");
		double heightCm=sc.nextDouble();
		double height = heightCm /100;
		System.out.println("몸무게(kg):");
		double weight=sc.nextDouble();
		
		double bmi = weight / (height*height);
		
		String result;
		if(bmi <18.5) {
			result = "저체중";
		}
		else if(bmi <23) {
			result = "정상체중";	
		}
		else if(bmi <=25) {
			result = "과체중";	
		}
		else {
			result = "비만";
		}
		
		System.out.println("당신의 BMI 는"+ bmi +"입니다.");
		System.out.println("BMI 수치에 따른 당신으 비만도는 \""+ result + "\" 입니다.");
		
		
	}

}

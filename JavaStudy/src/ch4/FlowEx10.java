package ch4;

import java.util.Scanner;

public class FlowEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요. (1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 입력한 정보를 tmp에 저장
		score = Integer.parseInt(tmp); // 입력된 문자열을 숫자로 변환
		
		switch (score /10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default :
			grade = 'F';
			
		} //end of switch

		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	} // main의 끝

}

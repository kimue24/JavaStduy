package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가위(1),바위(2),보(3) 중에 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3 ) + 1;
		
		System.out.println("당신은 "+ user + "입니다.");
		System.out.println("컴은"+ com +"입니다.");
		
		switch(user-com) { 
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0 :
			System.out.println("비겼습니다.");
			break;
		}

	} //main의 끝

}

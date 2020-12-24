package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("가위(1),바위(2),보(3) 중에 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3 ) + 1;
		

	}

}

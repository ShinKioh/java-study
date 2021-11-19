package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행
		// 조건에 맞지 않아도 한번은 무조건 실행
		/*
		int count = 100;

		System.out.println("do while 반복문");

		do {
			System.out.println("카운트 : " + count);
		} while (count++ < 5);
		*/
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; // 문자열 선언과 초기값을 공백(null)
		
		do {
			System.out.println("비밀번호 입력 > ");
			password = scanner.nextLine();
			
		} while(!password.equals(USER_PASSWORD)); // !true == false, !false == true
		
		scanner.close();
		
		System.out.println("접속 승인");
	}

}

package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("옵션을 선택 > ");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.close();
		
		/*
		if (option == 1) { // ifElseIfElse문 사용
			System.out.println("헬로우");
		}
		else if (option == 2) {
			System.out.println("안녕 ?");
		}
		else if (option == 3) {
			System.out.println("프로그램 종료");
		}
		else if (option == 10000) {
			System.out.println("이스터에그를 발견했습니다");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		}
		*/
		
		
		switch (option){ // switch문 사용
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕 ?");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다");
			break;
		default:	
			System.out.println("잘못된 옵션입니다");
			break;
		}
	}

}

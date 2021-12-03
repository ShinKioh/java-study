package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null포인트 예외는 RunTimeException으로 예외처리

		// 런타임 예외 예
		// System.out.println(5/0);
		
		// null포인트 예외, 객체가 null값인데 사용할 경우
		Scanner scanner = null; // 객체는 생성 안됨
		scanner.nextInt();
		
	}

}

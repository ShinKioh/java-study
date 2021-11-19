package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 break; 사용시 빠져나옴
		int count = 0;

		while (true) { // 무한 반복
			System.out.println("헬로우!" + count);

			if (count == 5) {
				break; // 반복문 종료
			}

			System.out.println("하 아 유 ?");

			count++;
		}

		System.out.println("프로그램 종료");
	}

}

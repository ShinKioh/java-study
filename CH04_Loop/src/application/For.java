package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 : for(초기값;조건;증감){명렴문;}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i: " + i);
//		}
		
//		for(;;) { // 무한 반복
//			System.out.println("헬로우!");
//		}
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.println(total);
	}

}

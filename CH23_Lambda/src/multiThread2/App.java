package multiThread2;

public class App {

	private int value = 0;
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				value++;
			}
		};
		
		Thread t1 = new Thread(runnable); // 새 thread t1 생성
		Thread t2 = new Thread(runnable); // 새 thread t2 생성
		
		t1.start();
		t2.start();
		
		// System.out.println("Value: " + value); // 메인 thread 실생
		
		t1.join(); // 메인 thread가 t1을 실행할 때까지 대기
		t2.join(); // 메인 thread가 t2를 실행할 때까지 대기
		
		System.out.println("Value: " + value); // t1, t2가 끝난 다음에 출력
	}
	
	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run(); // 앱 객체를 만들고 run() 메소드 실행

	}

}

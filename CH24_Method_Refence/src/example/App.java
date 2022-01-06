package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() { // static 메소드는 객체 생성없이 사용가능
		System.out.println("헬로우");
	}
	
	public static void main(String[] args) {
		// 메소드 레퍼런스(Static 메소드를 만들어 사용)
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
									// 클래스명::메소드명
	}

}

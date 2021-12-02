package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class Task2 implements Runnable{

	@Override
	public void run() { // Runnable의 추상메소드를 구현(완성)한다
		// 할일의 코드를 적는다
		System.out.println("타이머2 헬로우!");
	}
	
}

class Task1 extends TimerTask{
	
	public void run() {
		System.out.println("타이머1 헬로우");
	}
}


public class App {

	public static void main(String[] args) {
		// 타이머 1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0, 1000);
		
		// 타이머 2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS); // 1초에 한번씩 반복 

	}

}

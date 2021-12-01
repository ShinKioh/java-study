package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	
	public void run() {
		System.out.println("헬로우");
	}
}

public class App {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000); // 1000 : 1초에 한번씩 반복, L을 입력하지 않아도 자동 변환
		
	}

}

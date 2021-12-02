package timer_Ex1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Task1 extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i += 1;
		System.out.println("계란 삶는 중"+ i);	
	}
	
}

class Task2 implements Runnable{
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
	
}


public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task1(), 5000L, 5000L); // 5초에 한번 반복
		// 2. 30초 간격 타이머
		ScheduledExecutorService timer2 = Executors.newScheduledThreadPool(1);
		timer2.scheduleAtFixedRate(new Task2(), 30, 30, TimeUnit.SECONDS);
		
		
		

	}

}

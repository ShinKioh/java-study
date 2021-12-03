package game;

import java.util.Random;
import java.util.Scanner;

import game.Object.GameObject;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = GameObject.values(); // enum의 상수들을 리턴
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("삼세판 게임을 시작합니다.");
		int wins = 0;
		
		for (int i=1; i<=3; i++) { // i는 1부터 3까지 3번 반복
			//유저의 선택
			System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
			
			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			
			System.out.println("당신의 선택은 : " + ob1);
			System.out.println("컴퓨터 선택은 : " + ob2);
			
			int result = ob1.compare(ob2);
			wins += result;
			if (result>0) {
				System.out.println("당신의 승리!");
			} else if (result<0) {
				System.out.println("당신의 패배!");
			} else {
				System.out.println("비겼습니다! Draw");
			}
		}
		// 3번 가위바위보 끝난 후
		// 총점 wins로 전체 결과를 출력
		System.out.println();
		System.out.println("삼세판 결과는 : ");
		if (wins>0) {
			System.out.println("당신의 승리!");
		} else if (wins<0) {
			System.out.println("당신의 패배!");
		} else {
			System.out.println("비겼습니다! Draw");
		}
	}
}

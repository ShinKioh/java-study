package game;

import java.util.Random;

import game.Object.GameObject;
import game.Object.Paper;
import game.Object.Rock;
import game.Object.Scissors;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	
	public void run() {
		System.out.println("게임을 시작합니다.");
		
		int num = random.nextInt(objects.length);
		GameObject ob = objects[num];
		System.out.println(ob);
	}
}

package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true; // 게임을 계속 진행
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord(); // 화면에 단어 표시
			getUserInput(); // 철자 하나를 입력받음
			checkUserInput(); // 맞는지 체크 (전부 맞으면 running = false)
		} while (running);
	}

	private void displayWord() {
//		System.out.println("화면에 단어 표시");
//		2. 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		System.out.println(word.toString());
	}
	
	private void getUserInput() {
//		유저에게 한 문자 입력 요구
//		입력받은 문자열에서 한 문자를 뽑아서
//		RandomWord 클래스에 전달( addGuess(문자)메소드를 만들자 )
//		System.out.println("철자 하나 입력");
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자열을 guess에 저장 
//		단어에서 입력받은 문자가 있는지 확인해서 처리(단어는 RandomWord 객체 word 사용)
		word.addGuess(guess.charAt(0)); // guess.charAt(0) : 입력받는문자, 첫번째 문자를 입력
	}

	private void checkUserInput() {
//		유저가 단어를 다 맞췄는지 체크해서 게임을 종료
//		게임 종료 확인을 하는 메소드 isCompleted 를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 : " + word);
			running = false; // 반복문 빠져나옴 => 종료
		}
	}
	/**
	 * 스캐너를 닫는 메소드
	 */
	public void close() {
		// 게임 종료, 스캐너 닫기
		scanner.close();
	}

}

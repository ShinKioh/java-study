package application;

import java.util.Random;

public class RandomWord {
	// 스베이스바로 뛰어진 단어들을 문자열로 str에 저장
	private String str = "recognition inspection category conversation teaching operation initiative professor proposal perspective management complaint department politics significance collection apartment childhood negotiation birthday knowledge instruction argument activity strategy resource depression assumption baseball inflation conclusion language psychology restaurant analysis historian community possibility difference communication statement criticism grandmother assistant sympathy audience literature weakness decision presentation";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 입력

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)
	private Random random = new Random();

	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)]; // 1. 랜덤으로 선택 수정
		characters = new char[selectWord.length()];
	}

	public void getWords() { // 현재 words 배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {
		// 단어를 _로 출력한다.
//		String text = "";
		StringBuilder sb = new StringBuilder();
//		characters[3] = 'X'; // 텍스트 
		for (char c : characters) {
			sb.append(c == '\u0000' ? '_' : c); // 못맞출경우 _ , 맞추면 c
			sb.append(' ');
		}
//		System.out.println(selectWord); // 정답출력 (테스트용)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for (int i = 0; i < selectWord.length(); i++) { // 단어 길이만큼 반복
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
}

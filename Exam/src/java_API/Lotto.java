package java_API;

import java.util.Random;

class LottoMachine {
	private int[] LottoNumbers;

	public LottoMachine() {
		LottoNumbers = generate();
	}

	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();

		// 1. 임의의 숫자 6개를 추출하세요.
		for(int i=0; i<6; i++) {
			pickedNumbers[i] = rand.nextInt(45)+1;
		}

		return pickedNumbers;
	}
	
	// 생성된 로또번호를 가져오는 get메소드를 만드세요.
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
	
}

public class Lotto {
	public static void main(String[] args) {
		LottoMachine machine = new LottoMachine();

		int[] numbers = machine.getLottoNumbers();

		System.out.print("생성번호 : ");
		for (int i : numbers) {
			System.out.printf("%d ", i);
		}
	}
}

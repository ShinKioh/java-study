package example;

public class SumDigits {

	public static void main(String[] args) {

		int num = 374;
		int hunDigit = num / 100;
		int tenDigit = (num - 300) / 10;
		int oneDigit = (num - 300) % 10;
		int total = hunDigit + tenDigit + oneDigit;
		System.out.println(total);

	}

}

package method;

public class Pork {

	public static void main(String[] args) {

		/* 1. 변수를 생성하시오. */
		int num = 3; // 3인분

		/* 2. 메소드를 통한 칼로리를 계산하시오. */
		double result = calculate(num);

		/* 3. 결과를 출력하시오. */
		System.out.printf("삼겹살 %d인분 : %.2f kcal", num, result);
	}

	/* 4. 칼로리 계산을 위한 메소드를 작성하시오. */
	private static double calculate(int n) {
		int gram = n * 180; // 1인분 180g
		double kcal = gram * 5.179; // 1g 5.179kcal
		return kcal;
	}
}

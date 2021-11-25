package test;

public class TernaryCondition { // 삼항 조건 연산자, if else 문을 한 줄로

	public static void main(String[] args) {
		// 조건 ? A : B	( 조건이 참이면 A, 거짓이면 B)
		System.out.println(true ? "참" : "거짓");
		System.out.println(false ? "참" : "거짓");
		
		int n = 101;
		n = n > 100 ? 100 : n; // 100보다 크면 100출력 아니면 n
		System.out.println(n);

		int[] values = {6, 3, 92, 64, 17};
		int max = 0; // 최대값
		int min = 1000; // 최소값
		for(int val : values) {
//			if(val>max) {
//				max=val; // 맥스값보다 val이 크면 val값을 맥스에 넣는다
//			}
			max = val > max ? val : max;
			min = val < min ? val : min;
		}
		System.out.println(max);
		System.out.println(min);
	}

}

package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨 온도를 화씨 온도로 변환 (0°C × 9/5) + 32 = 32°F

		double c = 1; // 섭씨 변수 c 초기값을 25
		double f = (c * 9 / 5) + 32; // 화씨 변수 f는 공식대로
		
		System.out.println("섭씨 " + c + "는 화씨 " + f + "이다");
	}

}

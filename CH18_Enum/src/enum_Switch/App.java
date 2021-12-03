package enum_Switch;

public class App {

	public static void main(String[] args) {
		// enum을 클래스 처럼 사용
		Fruit fruit = Fruit.ORANGE;
		
		switch(fruit) {
		case ORANGE:
			System.out.println("오렌지");
			break;
		case BANANA:
			System.out.println("오렌지");
			break;
		case APPLE:
			System.out.println("오렌지");
			break;
		default:
			System.out.println("업는 과일입니다.");
			break;
		}
	}

}

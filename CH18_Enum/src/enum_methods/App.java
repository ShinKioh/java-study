package enum_methods;

public class App {

	public static void main(String[] args) {
		// enum을 클래스 처럼 사용

		Fruit[] fruits = Fruit.values();

		for (Fruit fruit : Fruit.values()) {
			System.out.println(fruit);
		}

		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());

		Fruit f1 = Fruit.valueOf("ORANGE");
		Fruit f2 = Fruit.valueOf("APPLE");
		Fruit f3 = Fruit.valueOf("BANANA");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f1 == Fruit.ORANGE);
		System.out.println(f2 == Fruit.APPLE);
		System.out.println(f3 == Fruit.APPLE);
	}

}

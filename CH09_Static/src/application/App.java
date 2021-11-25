package application;

public class App {

	public static void main(String[] args) {
		// static 변수는 클래스.변수로 객체 생성없이 사용
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);

		System.out.println(Cat.count);
		Cat cat1 = new Cat("마틸다");
		System.out.println(Cat.getCount());
		Cat cat2 = new Cat("라이언");
		System.out.println(Cat.getCount());
		Cat cat3 = new Cat("울버린");
		System.out.println(Cat.getCount());
		

		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat3.toString());

	}

}

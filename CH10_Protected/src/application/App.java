package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;
// import entities.* // 패키지 entities에 있는 모든 클래스

public class App {
	// 프로텍트protect 접근지정자 사용 시 다른 패키지에서 사용할 수 없고 상속받은 자식클래스에서 사용가능
	public static void main(String[] args) {
		
		Fruit f1 = new Apple();
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}

package inheritance;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메소드 eat(), 
		Animal ani = new Animal();
		ani.eat();
		
		// Bird 클래스는 메소드 fly
		Bird bird = new Bird();
		bird.eat(); // 상속받음
		bird.fly();
		
	}

}

package abstract_Class;

//추상 클래스를 상속받았을 경우 추상 메소드를 구현(만들어야)해야 됨
public class Monster extends GameObject {

	@Override
	public void describe() {
		// 추상클래스의 추상메소드 describe()를 완성시킨다.
		System.out.println("몬스터입니다.");
	}

}

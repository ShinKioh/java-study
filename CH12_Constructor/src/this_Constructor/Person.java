package this_Constructor;

public class Person {

	private String name;
	private int age;

	public Person() {
		// this() 생성자
		this("익명",0);
	}

	public Person(String name) { // 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this(name,0);
	}

	public Person(String name, int age) { // 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() { // 객체의 정보를 출력
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

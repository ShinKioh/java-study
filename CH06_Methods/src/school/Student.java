package school;

public class Student {
	private String name;
	private int age;
	private boolean visible; // 집체 true, 원격 false
	private double temperature; // 온도체크
	
	// 생성자
	public Student(String name, int age) {
		visible = true;
		temperature = 0.0;
		this.name = name;
		this.age = age;
	}
	
	// 자동완성 기능으로 getter setter 메서드 완성
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	// toString메서드
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 나이=" + age + ", 집체=" + visible + ", 온도=" + temperature + "]";
	}
	
}

package lambda_example;

interface Runner{
	void execute(); // 추상메소드 1개 => 람다식 사용가능
}

public class App2 {

	public static void main(String[] args) {
		Runner run = () -> 	System.out.println("헬로우"); 
		// 실행 코드가 한줄일때 코드블록{} 생략가능
		run.execute();
		
		System.out.println(run instanceof Runner); // run은 Runner의 객체?
		System.out.println(run.getClass()); // 클래스는 람다식
	}
}

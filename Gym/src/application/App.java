package application;

public class App {

	public static void main(String[] args) {
		// 헬스장 프로그램 시작
	
		Information information = new Information();
		
		information.setExistingClients("te4328", "1234"); // 기존 회원 생성
		information.setExistingClients("admin", "1234"); // 기존 회원 생성
		information.displayMenu(); // 기존회원 유무 선택
	}

}

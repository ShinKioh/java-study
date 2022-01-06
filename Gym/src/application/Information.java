package application;

import java.util.ArrayList;
import java.util.Scanner;

public class Information {

	private ArrayList<Client> clients = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	/*
	 * App에서 입력한 기존 회원 등록하기
	 */
	public void setExistingClients(String id, String password) {
		clients.add(new Client(id, password));
	}

	/**
	 * 메뉴 출력
	 */
	public void displayMenu() {

		System.out.println("저희 Gym에 오신 것을 환영합니다.");
		System.out.println("기존 회원이실 경우 [y], 신규 회원이실 경우 [n]을 입력해주세요. [y/n]");
		System.out.printf("기존 회원 여부 : ");

		String isVisited = scanner.next();

		switch (isVisited) {
		case "y":
			existClient();
			break;
		case "n":
			newClient();
			break;
		default:
			System.out.println("해당 사항이 없습니다. [y,n] 중 입력하시길 바랍니다.");
		}
	}

	/**
	 * 기존 고객 선택
	 */
	private void existClient() {

		System.out.println("************************************************");
		System.out.println("조회 결과, " + Client.getCount() + "개의 계정이 존재합니다. 원하시는 계정을 선택해주세요.");
		clients.forEach(c -> System.out.println(c.toString()));
		System.out.printf("선택 : ");

		int clientID = scanner.nextInt();

		if (clientID < 0 || clientID > Client.getCount()) {
			System.out.println("존재하지 않는 계정입니다.");
		} else {
			existSelectMonthMoney(clients.get(clientID - 1).getId());
		}

	}

	/*
	 * 신규회원 회원가입
	 */
	private void newClient() {
		System.out.println("************************************************");
		System.out.println("신규 회원님 환영합니다. 회원가입을 진행하도록 하겠습니다.");

		String id = input(1);
		String password = input(2);

		System.out.println("회원 등록되었습니다.");
		clients.add(new Client(id, password));

		System.out.println("************************************************");
		System.out.println(id + "님 환영합니다. 원하시는 개월과 금액을 선택해주세요.");

		selectMonthMoney();
	}

	/*
	 * 입력한 문자열의 공백 유무 확인, 비밀번호는 다시 한번 확인
	 */
	private String input(int menu) {

		String result = null;

		switch (menu) {
		case 1:
			while (true) {
				System.out.println("사용하실 id를 입력하세요.");

				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("id에는 공백이 들어갈 수 없습니다.");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("비밀번호를 입력하세요.");
				result = scanner.nextLine();

				System.out.println("비밀번호 확인을 입력하세요.");
				String checkPassword = scanner.nextLine();

				if (result.trim().isEmpty() || checkPassword.trim().isEmpty()) {
					System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다.");
				} else if (!result.equals(checkPassword)) {
					System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
				} else {
					break;
				}
			}
			break;
		case 3:
			while (true) {
				System.out.println("비밀번호를 입력하세요.");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("비밀번호가 공백입니다.");
				} else {
					break;
				}
			}
			break;
		}
		return result;
	}

	/**
	 * 기존 고객 선택 시 개월과 금액
	 * 
	 * @param id
	 */
	public void existSelectMonthMoney(String id) {
		System.out.println("************************************************");
		System.out.println(id + "님 환영합니다. 원하시는 개월수와 금액을 선택해주세요.");
		System.out.println("1. 1개월 10만원");
		System.out.println("2. 2개월 18만원");
		System.out.println("3. 3개월 24만원");
		System.out.println("4. 6개월 36만원");
		System.out.println("5. 12개월 60만원");
		System.out.printf("선택 : ");
		int monthMoney = scanner.nextInt();

		printMonthMoneyList(monthMoney);

	}

	/**
	 * 신규 고객 선택 개월과 금액
	 */
	public void selectMonthMoney() {
		System.out.println("1. 1개월 10만원");
		System.out.println("2. 2개월 18만원");
		System.out.println("3. 3개월 24만원");
		System.out.println("4. 6개월 36만원");
		System.out.println("5. 12개월 60만원");
		System.out.printf("선택 : ");
		int monthMoney = scanner.nextInt();

		printMonthMoneyList(monthMoney);

	}

	/* 개월에 따른 결제 금액
	 */
	public void printMonthMoneyList(int monthMoney) {
		switch (monthMoney) {
		case 1:
			System.out.println("************************************************");
			System.out.println("1개월 10만원을 선택하셨습니다.");
			System.out.println("결제하실 금액은 10만원입니다.");
			payment();
			break;
		case 2:
			System.out.println("************************************************");
			System.out.println("2개월 18만원을 선택하셨습니다.");
			System.out.println("결제하실 금액은 18만원입니다.");
			payment();
			break;
		case 3:
			System.out.println("************************************************");
			System.out.println("3개월 24만원을 선택하셨습니다.");
			System.out.println("결제하실 금액은 24만원입니다.");
			payment();
			break;
		case 4:
			System.out.println("************************************************");
			System.out.println("6개월 36만원을 선택하셨습니다.");
			System.out.println("결제하실 금액은 36만원입니다.");
			payment();
			break;
		case 5:
			System.out.println("************************************************");
			System.out.println("12개월 60만원을 선택하셨습니다.");
			System.out.println("결제하실 금액은 60만원입니다.");
			payment();
			break;
		default:
			System.out.printf("1~5 중 선택해주세요.");
		}
	}

	/**
	 * 카드결제, 현금결제 선택
	 */
	public void payment() {
		System.out.println("************************************************");
		System.out.println("결제방법을 선택해주세요.");
		System.out.printf("[card]:카드결제, [cash]:현금결제 -> ");

		String isCardCash = scanner.next();

		switch (isCardCash) {
		case "card":
			paymentCard();
			break;
		case "cash":
			paymentCash();
			break;
		default:
			System.out.printf("[card,cash] 중 선택해주세요.");
		}
	}
	
	/**
	 * 카드결제 선택 시 영수증 발급 유/무
	 */
	public void paymentCard() {
		System.out.println("************************************************");
		System.out.println("카드결제를 선택하셨습니다.");
		System.out.println("영수증이 필요하십니까?(y/n)");
		System.out.printf("[y/n] : ");

		String isReciept = scanner.next();

		switch (isReciept) {
		case "y":
			System.out.println("************************************************");
			System.out.println("영수증 발급이 완료되었습니다.");
			System.out.printf("감사합니다.");
			break;
		case "n":
			System.out.println("************************************************");
			System.out.println("계산이 완료되었습니다.");
			System.out.printf("감사합니다.");
			break;
		default:
			System.out.printf("[y,n]중 선택해주세요.");
		}
	}
	
	/**
	 * 현금 결제 시 현금 영수증 발급 유/무
	 */
	public void paymentCash() {
		System.out.println("************************************************");
		System.out.println("현금결제를 선택하셨습니다.");
		System.out.println("현금 영수증 필요하십니까?(y/n)");
		System.out.printf("[y/n] : ");

		String isReciept = scanner.next();

		switch (isReciept) {
		case "y":
			System.out.println("************************************************");
			System.out.println("현금 영수증 발급이 완료되었습니다.");
			System.out.printf("감사합니다.");
			break;
		case "n":
			System.out.println("************************************************");
			System.out.println("계산이 완료되었습니다.");
			System.out.printf("감사합니다.");
			break;
		default:
			System.out.printf("[y,n]중 선택해주세요.");
		}
	}
}

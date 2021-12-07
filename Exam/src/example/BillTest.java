package example;

public class BillTest {

	public static void main(String[] args) {
		int price = 152365;

		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;

		int discounted = 0;
		discounted = price - 152000;
		
		oman = price / 50000;
		chun = (price - 150000)/1000;
		
		int totalCnt = 0;
		totalCnt = oman+chun;
		
		System.out.printf("5만원 x %d\n", oman);
		System.out.printf("1만원 x %d\n", man);
		System.out.printf("5천원 x %d\n", ochun);
		System.out.printf("1천원 x %d\n", chun);
		System.out.println("--------------");
		System.out.printf("총 장수: %d장\n", totalCnt);
		System.out.printf("금액: %d원\n", price - discounted);
		System.out.printf("할인: %d원\n", discounted);
	}

}

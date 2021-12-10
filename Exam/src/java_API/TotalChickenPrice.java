package java_API;

import java.util.ArrayList;

class Chicken {
	private String name;
	private int price;

	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}

public class TotalChickenPrice {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Chicken> order = new ArrayList<>();

		// 1. 주문한 치킨을 ArrayList에 추가하세요.
		order.add(new Chicken("로스트", 9900));
		order.add(new Chicken("파닭", 12900));
		order.add(new Chicken("마늘아", 13900));

		// 2. ArrayList를 순회하여 총합을 구하세요.
		int sum = 0;

		for (int i = 0; i < order.size(); i++) {
			Chicken price = order.get(i);
			sum += price.getPrice();
		}

		// 결과출력
		System.out.printf("총합 : %d원\n", sum);
	}

}

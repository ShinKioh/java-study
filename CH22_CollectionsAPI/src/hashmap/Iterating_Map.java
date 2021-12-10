package hashmap;

import java.util.HashMap;

public class Iterating_Map {

	public static void main(String[] args) {
		// map 타입을 반복문 출력
		HashMap<String, String> months = new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");

		// 1. 람다식으로 출력
		months.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();

		// 2. entrySet() : key와 value 값을 가져옴
		for (var entry : months.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();

		// 3. keySet() : key값만 가져옴
		for (String key : months.keySet()) {
			String v = months.get(key);

			System.out.println(key + " : " + v);
		}

	}

}

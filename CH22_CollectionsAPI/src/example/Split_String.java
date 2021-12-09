package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "(CNN)As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever -- even beyond the growing data about waning vaccine immunity.";
		String text2 = "이재명 더불어민주당 대선 후보와 윤석열 국민의힘 대선 후보가 오차범위 내 접전을 벌이고 있다는 여론조사 결과가 나왔다.";
		
//		String[] words = text1.split("[^a-zA-Z]+"); // 영문철자를 제외한 특수문자 스페이스, 점, 슬래쉬같은 것들을 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");
		
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
	}

}

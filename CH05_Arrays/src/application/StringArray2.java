package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)은 주소값을 가진다.
		String text = null; // null값은 주소값이 없음, (String text : 참조변수)
		// int x = null; 기본 자료형에는 null값을 입력불가(null값은 주소가 없다는 뜻)
		text = new String("헬로우"); 
		
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3]; // 배열 문자열3칸을 실제 생성해서 texts에 주소입력
		System.out.println(texts);
		System.out.println(texts[0]);
		
		texts[0] = new String("하이!");
		texts[1] = "안녕!";
		texts[2] = "굿바이!";
		
		for(String word : texts) {
			System.out.println(word);
		}
	}

}

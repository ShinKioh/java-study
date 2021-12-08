package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\java\\java-study2\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation));){
			// 파일 읽기
			String line = null;
			// 한줄 읽기
			while ((line = reader.readLine()) != null) { // 파일의 끝에 더 이상 문자가 없으면 null
				System.out.println(line); // 더이상 읽은 줄이 없을때까지 읽어서 출력
			}
			
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우
			// e.printStackTrace(); 빨간색 예외처리
			System.out.println("파일을 찾지 못함 : " + fileLocation);

		} catch (IOException e) {
			// 파일을 읽지 못함 예외
			// e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}

	}

}

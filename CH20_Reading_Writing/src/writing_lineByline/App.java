package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\java\\java-study2\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();

		// 파일 쓰기
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("오렌지");
			br.newLine();
			br.write("apple");
			br.newLine();
			br.write("banana");
			br.newLine();
			br.write("배");
			br.newLine();
		} catch (IOException e) {
			// 파일을 쓸 수 없음
			// e.printStackTrace();
			System.out.println("파일을 쓸 수 없음 " + fileLocation);	
		}
		System.out.println("파일 쓰기 완료 : " + fileLocation);

	}

}

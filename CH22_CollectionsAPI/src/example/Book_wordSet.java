package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이때 리스트는 단어가 중복 되지 않는다. 알파벳 순으로 저장 => TreeSet
		File dracula = new File("dracula.txt");
		File huck = new File("huck.txt");
		// C:\JAVA\java-study3\CH22_CollectionsAPI\dracula.txt
		System.out.println(dracula.exists()); // 파일이 있느지 확인
		System.out.println(huck.exists());
		
		TreeSet<String> draList = loadWords(dracula);
		TreeSet<String> huckList = loadWords(huck);
		
		System.out.println(draList.size());
		System.out.println(huckList.size()); // 단어의 갯수
		
		displayWords(draList);
	}
	/**
	 * list를 입력받아 그 안에 단어들을 출력한다.
	 * @param list
	 */
	private static void displayWords(TreeSet<String> list) {
		// 트리셋을 입력받아 그 안에 단어들을 출력한다.
		int count = 0;
		for (String w : list) {
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	/**
	 * 입력된 파일을 읽어서 단어를 저장해서 마지막에 트리셋 리스트로 리턴
	 * 
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			// 파일 읽기
			String line = null;
			// 한줄 읽기
			while ((line = reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null
				String[] words = line.split("[^a-zA-Z]+");
				// 트리셋에 단어로 분리해서 입력한다.(자동 정렬 및 중복제거)
				for (String w : words) {
					if (w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase()); // 소문자로 단어 입력
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음");
		} catch (IOException e) {
			System.out.println("파일을 읽지 못함");
		}

		return wordSet;
	}

}
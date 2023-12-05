package JavaProgrammingClass;

import java.util.Scanner;

class Dictionary{
	private static String kor[] ={"사과","포도","오렌지"};
	private static String eng[] ={"apple","grape","orange"};
	public static String kor2eng (String word) {
		for(int i =0; i <kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

public class Java실습문제4_10번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		String word;
	
			while(true) {
			System.out.println("한글단어?");
			word = sc.next();
			if(word.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String result = Dictionary.kor2eng(word);
			if(result ==(null)) {
				System.out.println(word+"은 저의 사진에 없습니다.");
			}else {
				System.out.println(word+"은"+result);
				}
			}
	}

}

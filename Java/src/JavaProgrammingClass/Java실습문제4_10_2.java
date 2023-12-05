package JavaProgrammingClass;

import java.util.Scanner;

class Dictionary2{
	private static String kor []= {"사과","포도","딸기"};
	private static String eng []= {"apple","grape","strowberry"};
	public static String kor2eng(String word) {
		for (int i =0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		
		return null;
	} 
	
}

public class Java실습문제4_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word;
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.println("한글단어 검색:");
			word  = sc.next();
			if(word.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String result = Dictionary2.kor2eng(word);
			if(result == null) {
				System.out.println("해당하는 단어가 없습니다.");
			}else {
				System.out.println(word+"는 "+result+" 입니다.");
			}
		}
	}

}

package JavaProgrammingClass2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("바나나", "banana");
		h.put("포도", "grape");
		h.put("오렌지", "orange");
		
		//영던어 입력 받고, 한글 검색 "exit"로 종료
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();
			if(eng.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String kor = h.get(eng);
			if(kor == null) {
				System.out.println(eng+"는 없는 단어입니다");
			}else {
				System.out.println(kor);
			}
		}
		sc.close();
		

	}

}

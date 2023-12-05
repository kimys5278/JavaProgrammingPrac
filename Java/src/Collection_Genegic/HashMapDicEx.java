package Collection_Genegic;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic = new HashMap<String,String>();
		dic.put("김","kim");
		dic.put("박","park");
		dic.put("이","lee");
		dic.put("정","hung");
		dic.put("최","choi");
		
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("찾고싶은 단어는?");
			String kor = sc.next();

			if(kor.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String eng = dic.get(kor);
			if(eng == null) {
				System.out.println(kor+"는 없는 사람입니다.");
			}else {
				System.out.println(eng);
			}
			
		}
		sc.close();
		
	}

}

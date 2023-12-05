package JavaProgrammingClass2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		//요소 입력받기
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요.>>>");
			String s = sc.next();
			a.add(s);
		}
		
		//요소 모두 출력
		for(int i =0;i<a.size();i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		//가장 긴 이름 출력
		int longname=0;
		for(int i =0;i<a.size();i++) {
			if(a.get(longname).length()<a.get(i).length()) {
				longname = i ;
			}
		}
		System.out.println();
		System.out.println("가장 긴 이름: "+a.get(longname));
		sc.close();

	}

}

package JavaProgrammingClass;

import java.util.Scanner;

public class Java_Training3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 하나만 입력하세요>>");
		String s = sc.next();
		char c = s.charAt(0);
		for(int i =0; i<c -'a';i++) {
			for( char j = 'a';j<=c-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}

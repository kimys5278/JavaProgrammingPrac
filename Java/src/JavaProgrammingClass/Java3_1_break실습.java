package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_1_break실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.(종료하려면 'exit'를 입력하세요.)->>");
		while(true) {
			String str = sc.nextLine();
			if(str.equals("exit")) {
			break;
			}	
		}
		System.out.println("종료합니다.");
		sc.close();
	}

}
package JavaProgrammingClass;

import java.util.Scanner;

public class Java실습문제2_2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 정수 입력(10~99): ");
		int n = sc.nextInt();
		
		if(10<=n||n<=99) {
			int a = n/10;
			int b = n%10;
			if(a==b) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다." );
			}else {
				System.out.println("다시하세요.");
			}

		}else{	
			System.out.println("10~99 사이의 숫자가 아닙니다.");
		}
		
	}

}

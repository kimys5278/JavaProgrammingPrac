package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_예외처리실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("나뉨수를 입력하세요.");
			int dividend = sc.nextInt();
			System.out.println("나눔수를 입력하세요.");
			int divisor = sc.nextInt();
			try {
				System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
				break; // 정상적인 나누기 완료 후 while 벗어나기
				}
				catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
		sc.close();
	}

}

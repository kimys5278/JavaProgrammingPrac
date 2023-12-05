package JavaProgrammingClass;

import java.util.Scanner;

public class Java실습문제2_12번_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력:");
		double n_1 = sc.nextDouble() ;
		String s = sc.next();
		double n_2 = sc.nextDouble() ;
		double result = 0;
		switch(s) {
		case "+":
			result = n_1 + n_2;
			System.out.println(n_1+s+n_2+"의 계산 결과는"+result);
			break;
		case "-":
			result = n_1 - n_2;
			System.out.println(n_1+s+n_2+"의 계산 결과는"+result);
			break;
		case "*":
			result = n_1 * n_2;
			System.out.println(n_1+s+n_2+"의 계산 결과는"+result);
			break;
		case "/":
			result = n_1 - n_2;
			if(n_1 !=0||n_2!=0) {
				System.out.println(n_1+s+n_2+"의 계산 결과는"+result);
				break;
			}else {
			System.out.println("0으로 나눌 수 없습니다.");
			break;
			}
		
		}
		

	}

}

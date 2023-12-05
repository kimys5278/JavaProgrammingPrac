package JavaProgrammingClass;

import java.util.Scanner;

public class Java실습문제2_3번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		int price = sc.nextInt();
		System.out.println("오만원권"+price/50000+"매");
		price%=50000;
		System.out.println("만원권"+price/10000+"매");
		price%=10000;
		System.out.println("오천원권"+price/5000+"매");
		price%=5000;
		System.out.println("천원권"+price/1000+"매");
		price%=1000;
		System.out.println("오백원권"+price/500+"매");
		price%=500;
		System.out.println("백원권"+price/100+"매");
		price%=100;
		System.out.println("오십원권"+price/50+"매");
		price%=50;
		System.out.println("십원권"+price/10+"매");
	}
	

}

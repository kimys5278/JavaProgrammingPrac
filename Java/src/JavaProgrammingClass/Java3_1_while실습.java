package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_1_while실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int sum = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하고 마지막에 -1을 입력하세요.");
		
		int n =sc.nextInt();
		while(n != -1) {
			sum += n;
			cnt++;
			n = sc.nextInt();
		}
		if(cnt ==0) {
			System.out.println("입력된 수 가 없습니다.");
		}else {
			
			System.out.println("정수의 개수는"+cnt+"입니다.");
			
			System.out.println("평균은"+(double)sum/cnt+"입니다.");
			
		}
		sc.close();
	}

}

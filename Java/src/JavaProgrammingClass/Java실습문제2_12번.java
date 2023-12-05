package JavaProgrammingClass;

import java.util.Scanner;

public class Java실습문제2_12번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입력: ");
		
		Double n_1 = sc.nextDouble();
		String s = sc.next(); 
		Double n_2 = sc.nextDouble();
		Double result ;
	
		if(s.equals("+")) {
			result = n_1+n_2;
			System.out.println((n_1+n_2)+"의 계산결과는"+result+"입니다.");
		}else if(s.equals("-")) {
			result = n_1-n_2;
			System.out.println((n_1-n_2)+"의 계산결과는"+result+"입니다.");
	
		}else if(s.equals("*")) {
			result = n_1*n_2;
			System.out.println((n_1*n_2)+"의 계산결과는"+result+"입니다.");
	
		}else if(s.equals("/")) {
			if(n_1!=0 && n_2!=0) {
			result = n_1/n_2;
			System.out.println((n_1/n_2)+"의 계산결과는"+result+"입니다.");
			}else {
				System.out.println("0으로 나눌 수 없습니다.");		
			}
		}else {
			result = n_1%n_2;
			System.out.println((n_1%n_2)+"의 계산결과는"+result+"입니다.");
		
		}


	}

}

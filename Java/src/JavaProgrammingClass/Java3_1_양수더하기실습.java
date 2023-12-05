package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_1_양수더하기실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(int i =0; i<5;i++) {
			int n = sc.nextInt();
			if(n<=0){
				continue;
			}else {
				sum+=n;
			}
		}
		
		System.out.println("양수의 합"+sum);
		sc.close();
	}

}

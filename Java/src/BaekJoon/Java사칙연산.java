package BaekJoon;

import java.util.*;

public class Java사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 int A = sc.nextInt();
		 int B = sc.nextInt();
		 int C = sc.nextInt();
		 
		 System.out.println((A+B)%C);
		 System.out.println((A%C)+(B%C)%C);
		 System.out.println((A*B)%C);
		 System.out.println((A%C)*(B%C)%C);
		
	}

}

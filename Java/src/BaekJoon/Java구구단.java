package BaekJoon;

import java.util.Scanner;

public class Java구구단 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		int x ;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		for(int i =1; i < 2; ++i) {
			for(int j =1; j <10; ++j) {
				System.out.printf("%d x %d =%d \n",x,j,x*j);
			}
		}
	}
}

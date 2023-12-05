package BaekJoon;

import java.util.Scanner;

public class Java반복문덧셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new  Scanner(System.in); 
		int a ; 
		a = sc.nextInt();
		
		int b;
		int c;
		
		for(int i=0;i<a;++i) {
			b = sc.nextInt();
			c = sc.nextInt();
			
			System.out.println(b+c);
		}
 
	}

}

package BaekJoon;

import java.util.Scanner;

public class Java25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		for(int i =0; i<N;++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			X = X-(a*b);
			 

		}
		if(X==0) {System.out.println("Yes");}
		else {System.out.println("No");}
		

	}

}

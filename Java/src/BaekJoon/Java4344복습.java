package BaekJoon;

import java.util.Scanner;

public class Java4344복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] arr;
		int C = sc.nextInt();
		for(int i=0 ; i<C;i++) {
			int N  = sc.nextInt();
			arr = new int [N];
			double sum =0;
			for(int j = 0; j<N;j++) {
				int val = sc.nextInt();
				arr[j]=val;
				sum+=val;
		
			}
			double mean = (sum/N);
			double cnt = 0;
			for(int j =0;j<N;j++) {
				if(arr[j]>mean) {
				cnt++;
				}
			}
			System.out.printf("%.3f%\n",(cnt/N)*100);
		}
		sc.close();
		
	}

}

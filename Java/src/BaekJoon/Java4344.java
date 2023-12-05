package BaekJoon;

import java.util.Scanner;

public class Java4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] arr;
		int C = sc.nextInt();
		for(int i=0;i<C;i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double sum=0;
			for(int j =0;j<N;j++) {
				int val = sc.nextInt();
			arr[j]=val;
			sum+=val; 
			}
			double maen = (sum/N);
			double count = 0; //평균넘는 학생 수
			
			for(int j =0;j<N;j++) {
				if(arr[j]>maen) {
					count++;
				}
				
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		sc.close();
	}

}

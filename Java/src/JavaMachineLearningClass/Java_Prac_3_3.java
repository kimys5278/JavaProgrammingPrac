package JavaMachineLearningClass;

import java.util.Scanner;

public class Java_Prac_3_3 {
	
	static class arraytest{
		public static void top_n() {
			int arr [];
			int max = 0;
			arr= new int [5];
			Scanner sc = new Scanner(System.in);
			System.out.println("양수 5개 입력:");
			for(int i=0;i<5;i++) {
				arr[i] = sc.nextInt();
				if(arr[i]>= max) {
					max = arr[i];
				}
				
			}
			System.out.println("제일 큰수 : "+max);
			
		}
		
		public static void average() {
			int sum =0;
			int arr2 [];
			arr2 = new  int [5];
			System.out.println(arr2.length +"개의 양수 5개 입력:");
			
			Scanner sc2 = new Scanner(System.in);
			for (int i =0;i<arr2.length;i++) {
				arr2[i] = sc2.nextInt();
			}
			for (int i =0;i<arr2.length;i++) {
				sum+=arr2[i];
			}
			
			System.out.println("평균 => "+(double)sum/arr2.length);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= 'a';
		do {
			System.out.print(c+" ");
			c = (char)(c+1);
		}while(c <='z');
		System.out.println();
		arraytest arrtest = new arraytest();
		arrtest.top_n();
		arrtest.average();
	}

}

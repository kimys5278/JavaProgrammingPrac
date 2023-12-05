package JavaProgrammingClass;

import java.util.Scanner;

public class Java_Training3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("양의 정수 10개를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [10];
		for(int i =0;i<10;i++) {
			int n = sc.nextInt();	
			if(n%3 ==0) {
			arr[i]=n;	
			System.out.println(arr[i]);
			}
		}
		
		
		}

}

package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_2배열실습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
		int sum =0 ;
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
		} 
		System.out.println("평균은 "+sum/(arr.length)+" 입니다.");
		sc.close();
	}

}

package JavaProgrammingClass;

import java.util.Scanner;

public class Java_Training3_7 {
	public static void main(String[] args){
	int arr [] = new int [10];
	double sum = 0;
	System.out.printf("랜덤한 정수들: ");
	for(int i =0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
			sum += arr[i];
			System.out.print(arr[i]+" ");
	}
	System.out.print("\n평균은? "+sum/10);
	
	
	}

}

package JavaProgrammingClass;

import java.util.Scanner;

public class Java3_2배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[5];
		int max = 0;
		System.out.println("양슈 5개를 입력하세요.");
		for(int i =0;i<5;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}

		}
		System.out.println("가장 큰 수는 "+max+" 입니다.");
		sc.close();
	}

}
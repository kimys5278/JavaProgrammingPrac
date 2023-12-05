package Java배열과반복문;

import java.util.Scanner;

public class Java배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[5]; //배열생성
		
		int max, min ;
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");
		
		for(int i = 0 ; i< num.length;++i) {
			num [i] = sc.nextInt(); // 데이터입력 
		}
		
		 max = num[0]; // 최대값 초기화
		 min = num[0]; // 최솟값 초기화
		
		 for(int i=0;i<num.length;++i) {
			 
			 if(max<num[i]) { 
				 max = num[i];
			 }
			 if(min>num[i]) {
			 		min = num[i];
			 	
	 }
    }
		 
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
  }
}

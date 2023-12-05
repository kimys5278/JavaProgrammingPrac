package Java배열과반복문;

import java.io.BufferedReader;

public class Java배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [] = new int[5];
		int sum = 0;
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50; 
		
		
		for(int i =0 ; i<num.length;++i) {
		
			sum+=num[i];
		System.out.println(sum);

		
		}
	}

}

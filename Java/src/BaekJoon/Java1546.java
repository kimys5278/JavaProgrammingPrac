package BaekJoon;

import java.util.Scanner;
import java.util.Arrays;

public class Java1546 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double arr[] = new double[in.nextInt()];
		
		for (int i =0; i<arr.length;i++) {
			arr[i] = in.nextDouble();
		}
		in.close();
		
	double sum = 0;
	Arrays.sort(arr); 
	
	for (int i =0 ;i<arr.length;i++) {
		sum=+((arr[i]/arr[arr.length-1])*100);
	}
	System.out.println(sum/arr.length);
	}
}



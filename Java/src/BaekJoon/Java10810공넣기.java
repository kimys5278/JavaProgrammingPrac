package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10810공넣기 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int [] arr = new int [N];
		int M = Integer.parseInt(st.nextToken());
	
		for(int a = 0; a<M;a++) {
		st = new StringTokenizer(bf.readLine());
			
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int b= i-1; b<j;b++ ) {
			arr[b] = k;
			}
		
		}
		for(int b = 0;b<arr.length;b++) {
			System.out.print(arr[b]+ " ");
		}
		
		
	}

}

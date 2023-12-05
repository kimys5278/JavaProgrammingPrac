package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10810공넣기2 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//N,M- 각각 바구니 갯수 와 넣을 공의 갯수
		
		int N = Integer.parseInt(st.nextToken());
		int [] arr =new  int [N];
		int M = Integer.parseInt(st.nextToken());
		
		for(int i =0 ; i<M;i++ ) {
			st = new StringTokenizer(bf.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			for(int a =I-1;a<J;a++  ) {
				arr[a]=K;
			}
		}
		for(int a = 0;a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
			
	}

}

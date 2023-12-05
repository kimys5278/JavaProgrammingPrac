package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10813공바꾸기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		for(int a = 0; a<N;a++) {
			arr[a] = a+1;
		}
		for(int a =0;a<M;a++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int tmp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = tmp;
			
			}
		for(int a =0; a<arr.length;a++) {
			System.out.print(arr[a]+" ");
		}
	
	}

}

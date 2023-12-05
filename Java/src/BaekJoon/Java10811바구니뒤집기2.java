package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java10811바구니뒤집기2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	
	int arr []= new int [N+1];
	
	for(int a = 1;a<N;a++) {
		arr[a] = a;
		}
	
		for(int b =0 ;b<M;b++) {
			Stack <Integer> stack = new Stack<>();
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			for(int c =i;c<j;c++) {
				stack.push(arr[c]);
			}
			for(int c = i;c<j;c++) {
				arr[c]=stack.pop();
			}
			
		}
		StringBuilder sb = new StringBuilder ();
		for(int a = 1 ;a<=N;a++ ) {
			sb.append(arr[a]+" ");
		}
		bw.write(sb.toString()+"\n");
		bw.flush();
		bw.close();
		br.close();
	
	}

}

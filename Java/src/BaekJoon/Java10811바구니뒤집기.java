package BaekJoon;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java10811바구니뒤집기 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr [] = new int[N+1];
		
		for(int a =1;a<=N;a++) {
			arr[a] = a;
		}	
		
		for(int a = 0; a<M;a++) {
			
		Stack <Integer>stack = new Stack<>();
		st=new StringTokenizer(bf.readLine());
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		
		for(int b=i;b<=j;b++) {
			stack.push(arr[b]);
			}
		for(int b=i;b<=j;b++) {
			arr[b]=stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int b = 1; b<=N;b++) {
			sb.append(arr[b]+" ");
			}	
		bw.write(sb.toString()+"\n");
		bw.flush();{
		bw.close();
		bf.close();
		
		}	

	}
}

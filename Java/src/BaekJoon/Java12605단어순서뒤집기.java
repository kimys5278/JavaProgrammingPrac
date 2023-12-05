package BaekJoon;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java12605단어순서뒤집기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<String>stack = new Stack<>();
		for(int i=0;i<N;i++) {
			String s = br.readLine();
			String [] str  = s.split(" ");
			for(int j=0;j<str.length;j++) {
				stack.push(str[j]);
			}
			System.out.println("Case #"+(i+1)+":");
			
			while(!stack.isEmpty()) {
				System.out.print((stack.pop()));
				System.out.print(" ");
				if(stack.isEmpty()) {
					System.out.println();
				}
	
			}
			
		}	
		
	}
	
}


package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2675문자열반복2 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for(int i =0;i<T;i++) {
			String [] str = bf.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			String s = str[1];
			for(int j=0;j<s.length();j++) {
				for(int a=0;a<R;a++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}

}

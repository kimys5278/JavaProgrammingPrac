package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9086문자열 {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num  = Integer.parseInt(bf.readLine());
		StringBuilder sb =new StringBuilder();
		for(int i =0; i<num; i++){
			String s =bf.readLine();
			sb.append(s.charAt(0));
			sb.append(s.charAt(s.length()-1)+"\n");
		}
		System.out.println(sb);
	}

}

package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java25314체육과목 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i = Integer.parseInt(br.readLine())/4;
		System.out.print("long ".repeat(i)+"int");
		
	}
}

package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java27866 {

	public static void main(String[] args)throws IOException{ 
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().trim();
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(S.substring(n-1,n));
	
	}

}

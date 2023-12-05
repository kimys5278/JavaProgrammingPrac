package BaekJoon;

import java.util.Scanner;
//import java.util.*;
public class JavaBaekjoon1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두수를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		sc.close();
		if (a > b)
			System.out.println('>');
			
		
     	  else if (a < b) 
     		System.out.println('<');
		
	     else 
	    	System.out.println("==");
		
	 }
}

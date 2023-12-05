package BaekJoon;

import java.util.Scanner;

public class JavaPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      Scanner sc = new Scanner(System.in);
		      int arr[] = new int[26];
		      
		      String str = sc.next();
		      
		
		      
		      for(int i = 0; i < 26; i++) {
		         for(int j = 0; j < str.length(); j++) {
		            if(str.charAt(j) == (char)65 + i ||  
		                  str.charAt(j) == (char)97 + i) {
		               arr[i] += 1;
		            }
		         }
		      }
		      
		      int max = -1;
		   
		      int c = 1;
		      
		      for(int i = 0; i < 26; i++) {
		         if(arr[i] > max  ) {
		            max = arr[i];
		        	c = (char)(i+65);
		         }
		         else if(arr[i]==max) {
		            c='?';
		         }
		      }
		      

		            System.out.println((char)c);
		         }
		         
		         
		      
		      
		   
		   
		 
	}



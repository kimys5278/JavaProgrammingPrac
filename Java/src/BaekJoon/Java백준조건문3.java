package BaekJoon;

import java.util.Scanner;

public class Java백준조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y ;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x>0) {
        	if(y>0) {
        		System.out.print("1");
        	}
        	
        	else {     
        		System.out.print("4"); 
        	}
        
 
        }
        else {
        	if (y>0) {
        		System.out.print("2");
        	}
        	else {
        		System.out.print("3");
        	}
        }
	}
}

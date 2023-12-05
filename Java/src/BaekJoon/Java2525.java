package BaekJoon;

import java.util.Scanner;

public class Java2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C,min,hour,minute;
		
		Scanner sc =new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C= sc.nextInt();
		
		min = A*60 +B;
		min = min + C;
		 
		hour = (min/60)%24;
		minute = min%60;
		
		System.out.println(hour + " " + minute);
		
			}
		}
		
		


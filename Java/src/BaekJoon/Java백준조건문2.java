package BaekJoon;

import java.util.Scanner;

public class Java백준조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		Scanner sc = new  Scanner(System.in);
		year = sc.nextInt();
		
		if(year%4==0&&year%400==0){
			System.out.println(1);
		}
		else if(year%4==0&&year%100!=0){
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
 
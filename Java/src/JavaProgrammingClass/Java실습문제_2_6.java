package JavaProgrammingClass;

import java.util.Scanner;

public class Java실습문제_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수를 입력하세요");
		int num = sc.nextInt();
		int n = num/10;
		int a = num%10;
		if(1<=n&&n<=99) {
		if(n==3||n==6||n==9) {
			if(a==3||a==6||a==9) {
				System.out.println("박수짝짝");
			}
			System.out.println("박수짝");
		}else {
			if(a==3||a==6||a==9) {
			System.out.println("박수짝");
			}else {
				System.out.println(num);
					}
				}

			}	

		}
	}

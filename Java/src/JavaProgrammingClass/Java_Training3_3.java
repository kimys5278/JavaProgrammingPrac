package JavaProgrammingClass;

import java.util.Scanner;

public class Java_Training3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int a =sc.nextInt();

		for(int i = 0; i<a;i++) {
			for(int j=0; j<a-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

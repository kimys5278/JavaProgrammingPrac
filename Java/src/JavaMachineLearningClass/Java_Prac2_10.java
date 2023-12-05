package JavaMachineLearningClass;

import java.util.Scanner;

class if_prac{
	public static void SuccesorFail(int n) {
		if(n>=80) {
			System.out.println(n+"점 입니다. 합격");
		}else {
			System.out.println(n+"점 입니다. 불합격");	
		}
	}
	
	public static void basu3_7(int n) {
		if((n%3==0)&&(n%7==0)) {
			System.out.println(n+"은 3과 7의 배수입니다.");
		}else {
			System.out.println(n+"은 3과 7의 배수가 아닙니다.");
		}
	}
	
}
public class Java_Prac2_10 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1(합,불 메서드)과2(3,7배수출력)를선택하세요.");
		int a = sc.nextInt();
		if_prac ip = new if_prac();
		int n;
		
		switch(a) {
		
		case 1:
			System.out.println("점수를 입력하세요.");
			 n = sc.nextInt();
			ip.SuccesorFail(n);
			break;
		case 2:
			System.out.println("정수를 입력하세요.");
			 n = sc.nextInt();
			ip.basu3_7(n);
			break;
		
		}
		
		
		/*if(a ==1) {
			System.out.println("점수를 입력하세요.");
			int n = sc.nextInt();
			ip.SuccesorFail(n);
			
		}else if(a==2) {
			System.out.println("정수를 입력하세요.");
			int n = sc.nextInt();
			ip.basu3_7(n);
			
		}else {
			System.out.println("1,2만 입력하세요.");
		}*/
		
		
	}

}

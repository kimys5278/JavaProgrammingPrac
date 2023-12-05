package JavaProgrammingClass;

import java.util.Scanner;

class add{
	int a,b;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;

	}
	public int calculrator() {
			return a+b;
			
					
		}
	}

class sub{
	int a,b;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculrator() {
		
		return a-b;
	}
}
class mul{
	int a,b;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculrator() {
		return a*b;
	}
}
class div{
	int a,b;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int calculrator() {
		return a/b;
	}
}

public class Java실습문제4_11번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 정수와 피연산자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String p = sc.next();

		
		
		switch(p) {
		case "+":
			add ad = new add();
			ad.set(a,b);
			System.out.println(ad.calculrator()); 
			break;
		case "-":
			sub su = new sub();
			su.set(a,b);
			System.out.println(su.calculrator()); 
			break;
		case "*":
			mul mu = new mul();
			mu.set(a,b);
			System.out.println(mu.calculrator()); 
			break;
		case "/":
			div di = new div();
			di.set(a,b);
			System.out.println(di.calculrator()); 
			break;
			
			}
		}
		

	}



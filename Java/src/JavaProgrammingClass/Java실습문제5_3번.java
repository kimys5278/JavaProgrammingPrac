package JavaProgrammingClass;

import java.util.Scanner;

abstract class Won2Doller{
	public abstract double won(double a);
}


public class Java실습문제5_3번 extends Won2Doller{
	
	@Override
	public double won(double a){
	
		return a /1200;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원을 달러로 바꿉니다.");
		Java실습문제5_3번 ch = new Java실습문제5_3번();
		Scanner sc =new Scanner(System.in);
		System.out.print("원을 입력하세요>> ");
		double w = sc.nextInt();
		System.out.println("변환 결과: "+ch.won(w)+" 달러 입니다.");
		
	}

}

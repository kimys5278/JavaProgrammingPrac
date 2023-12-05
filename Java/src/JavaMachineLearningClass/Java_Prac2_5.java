package JavaMachineLearningClass;

import java.util.Scanner;


class Operator{
	public static void deip(int a,int b, int c) {
		a+=3;
		b*=3;
		c%=2;
		
		System.out.println("a= "+a+" b= "+b+" c= "+c);
		
	}
	
	public static void jg(int a, int d) {
		a = d++;
		System.out.println("a= "+a+" d= "+d);

		a = ++d;
		System.out.println("a= "+a+" d= "+d);

		a = d--;
		System.out.println("a= "+a+" d= "+d);

		a = --d;
		System.out.println("a= "+a+" d= "+d);
		
		
	}
	
	
}

public class Java_Prac2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int time = sc.nextInt();
		
		int second, minute,hour;
		
		second = time%60;
		minute = (time/60)%60;
		hour = (time/60)/60;
		
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초 입니다." );
		
		System.out.println();
		
		int a = 3,b=3,c=3,d=3;
		
		Operator op = new Operator();
		op.deip(a, b, c);
		op.jg(a, d);

	}

}

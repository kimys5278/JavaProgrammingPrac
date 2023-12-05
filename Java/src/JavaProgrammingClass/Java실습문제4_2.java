package JavaProgrammingClass;

import java.util.Scanner;

class Grade{ 
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int averages = (this.math+this.english+this.science)/3;
		return averages;
	}
	
}

public class Java실습문제4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >>>");
		
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science,english);
		System.out.println("평균은 "+me.average());
		sc.close();
		
		
	
		

	}

}

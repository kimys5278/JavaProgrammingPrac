package JavaProgrammingClass;

import java.util.Scanner;

public class Java2_2_입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next(); // 문자열 읽기
		System.out.print("이름은 " + name + ", ");
		
		String city = sc.next(); // 문자열 읽기
		System.out.print("도시는 " + city + ", ");
		
		int age = sc.nextInt(); // 정수 읽기
		System.out.print("나이는 " + age + "살, ");
		
		double weight = sc.nextDouble(); // 실수 읽기
		System.out.print("체중은 " + weight + "kg, ");
		
		boolean single = sc.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		
		sc.close(); // scanner 닫기

		
		

	}

}

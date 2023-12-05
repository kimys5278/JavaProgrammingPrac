package JavaMachineLearningClass;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int score = sc.nextInt();
		if(score >=80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		sc.close();
	}

}

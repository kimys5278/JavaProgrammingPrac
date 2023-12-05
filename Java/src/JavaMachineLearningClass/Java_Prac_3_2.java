package JavaMachineLearningClass;

import java.util.Scanner;

public class Java_Prac_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요.(종료는 -1)");
		int cnt = 0;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num != -1) {
		sum+=num;
		cnt++;
		num = sc.nextInt();
		if(cnt ==0) {System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.print("정수 갯수는"+cnt+"개, 평균은"+(double)sum/cnt+"\n");
			
				}
			}
		}	
	}

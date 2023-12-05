package JavaOOP2;

import java.util.Scanner;

class game{
	public void input() {
		System.out.println("가위 바위 보 게임");
		System.out.println("1.가위 2.바위 3.보 중 한 가지를 선택하세요.");
		String[] j = {"가위", "바위","보"};
		double random=Math.random();
		int comnum = (int)Math.round(random * (j.length-1));

		
		Scanner sc = new Scanner(System.in);
		int you = sc.nextInt();
		
		
		System.out.printf("컴퓨터가 ");
		if (comnum == 1) {
			System.out.printf("가위를");
		}
		else if(comnum==2) {
			System.out.printf("바위를");
		}
		else {
			System.out.printf("보를");
		}
		System.out.printf(" 냈습니다.");
		
		System.out.printf("당신은 ");
		if (you == 1) {
			System.out.printf("가위를");
		}
		else if(you==2) {
			System.out.printf("바위를");
		}
		else if(you ==3 ) {
			System.out.printf("보를");
		}
		System.out.printf(" 냈습니다. ");
	
		
		if(comnum ==you) {
			System.out.println(" 동점입니다.");
		}
		else if(comnum == 1 &&you ==2||comnum==2&&you==3||comnum==3&&you==1 ) {
			System.out.println("당신이 이겼습니다.");
		}
		else {
			System.out.println("당신이 졌습니다.");
			}
		}
		
	}
	


public class Java객체연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		game g = new game();
		g.input();
	
	}

}

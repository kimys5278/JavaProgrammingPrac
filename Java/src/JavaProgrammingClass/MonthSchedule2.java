package JavaProgrammingClass;

import java.util.Scanner;

class Day2{
	private String work;
	
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(work ==null) {
			System.out.println("없습니다.");
		}else {
			System.out.print(work+"입니다.");
		}
	}
}

public class MonthSchedule2 {
	Scanner sc = new Scanner(System.in);
	
	int daynum;
	Day days[];
	boolean state =true;
	
	public MonthSchedule2(int x) {
		daynum =x;
		days = new Day[daynum]; 
		for(int i =0;i<days.length;i++) {
			days[i] = new Day();
		}
	}
	
	public void input() {
		System.out.println("날짜(1~30)?");
		int i =sc.nextInt();
		System.out.println("할일(빈칸없이입력)?");
		String w =sc.next();
		days[i-1].set(w);
		
	}
	public void view() {
		System.out.println("날짜(1~30)?");
		int i =sc.nextInt();
		System.out.println(i+"의 할일은");
		days[i-1].show();
		
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		state = false;
		
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(state) {
			
			System.out.println("할일(입력:1,보기:2,끝내기:3) >>"); 
			int n = sc.nextInt();
			switch (n) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default :
				System.out.println("다시 입력하세요."); 
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule2 april = new MonthSchedule2(30);
		april.run();
	}

}

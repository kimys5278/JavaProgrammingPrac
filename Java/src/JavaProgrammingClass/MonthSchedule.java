package JavaProgrammingClass;

import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work+"입니다.");
		}
	}
	
	
}

public class MonthSchedule{
	
	int daynum;
	Day day[];
	boolean state = true;
	
	Scanner sc = new Scanner(System.in);
	
	public MonthSchedule(int x) {
		daynum = x;
		day =new Day[daynum];
		for(int i=0;i<day.length;i++) {
			day[i] = new Day();
		}
	}
	
	public void input() {
		System.out.println("날짜(1~30)?");
		int dd = sc.nextInt();
		System.out.println("할일 입력(빈칸 없이 입력)?");
		String ww = sc.next();
		day[dd-1].set(ww);
		
	}

	public void view() {
		System.out.println("날짜(1~30)?");
		int dd = sc.nextInt();
		System.out.println(dd+"일의 할일은 ");
		day[dd-1].show();
		
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		state = false;
	}
	
	public void run() {
		int option;
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(state) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
			option = sc.nextInt();
			switch(option) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("다시 입력해주세요!");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}

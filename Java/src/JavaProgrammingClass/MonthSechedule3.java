package JavaProgrammingClass;

import java.util.Scanner;

class Day3{
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
		}else {
			System.out.println(work+"입니다.");
		}
	}
}

public class MonthSechedule3 {
	Scanner sc = new Scanner(System.in);
	Day3 days[];
	int daynums ;
	boolean state = true;
	public MonthSechedule3(int x) {
		daynums = x;
		days = new  Day3[daynums];
		for( int i =0;i<days.length;i++) {
			days[i] = new Day3();
		}
	}
	
	public void input() {
	System.out.println("날짜(1~30)>> ");
	int d2 = sc.nextInt();
	System.out.println("할일 (빈칸없이입력) ");
	String works = sc.next();
	days[d2-1].set(works);
	}
	
	public void view() {
		System.out.println("날짜(1~30)>> ");
		int d2 = sc.nextInt();
		System.out.println(d2+"일의 할일은?" );
		days[d2-1].show();
		
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		state = false;
		
	}
	public void run() {
		System.out.println("이번달 스케쥴 프로그램");
		while(state) {
		System.out.println("할일 입력하세요(입력:1, 보기:2, 끝내기ㅣ:3)");
		int n = sc.nextInt();
		switch(n) {
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
			System.out.println("다시 입력하세요");
			}
		System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthSechedule3 april = new MonthSechedule3(30);
		april.run();
	}

}

package JavaProgrammingClass;

import java.util.Arrays;
import java.util.Scanner;

class Phone{
	String name;
	String tel;
	
	public boolean search(int d, String s) {
		int i=0;
		
		if(name.equals(s)) {
			
			return true;
		}else {
			return false;
				}
		}

}
public class Java_4주차과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("인원수 >>>");
		
		int d =sc.nextInt();
		Phone p[]  = new Phone[d];
		for(int i=0;i<p.length;i++) {
			p[i] = new Phone();
		}
		for(int i =0; i <p.length;i++) {
			System.out.println("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력)>>>");
			String name = sc.next();
			p[i].name = name;
			String tel = sc.next();
			p[i].tel = tel;
		}
		System.out.println("저장되었습니다...");
		for(;;) {
			System.out.println("검색할 이름");
			String searchname = sc.next();
			if(searchname.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for(int i =0;i<p.length;i++) {
				if(true==p[i].search(d, searchname)) {
					System.out.println(searchname+"의 번호는"+p[i].tel+"입니다.");
					break;
				}else if(false == p[i].search(d,searchname)&&i==d-1){
					System.out.println(searchname+"이 없습니다.");
					
					break;
				}
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}

}

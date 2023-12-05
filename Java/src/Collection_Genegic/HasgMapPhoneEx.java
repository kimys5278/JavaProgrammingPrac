package Collection_Genegic;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private int id;
	private String tel;
	public Student(int id,String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class HasgMapPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Student> map = new HashMap<String,Student>();
		map.put("김", new Student(1,"010-1234-5678"));
		map.put("나", new Student(2,"010-5334-1668"));
		map.put("박", new Student(3,"010-6753-4322"));
		map.put("이", new Student(4,"010-9021-6514"));
		map.put("윤", new Student(5,"010-7749-0212"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("검색할 이름?");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			Student sdt = map.get(name);
			if(sdt==null) {
				System.out.println("검색한 이름이 없습니다.");
			}else {
				System.out.println(sdt.getId()+":"+sdt.getTel());
			}
			
			
			
		}
		sc.close();
	}

}

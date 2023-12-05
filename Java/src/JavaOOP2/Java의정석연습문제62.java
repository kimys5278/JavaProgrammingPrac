package JavaOOP2;


class student{
	String a;
	public student(String a) {
		this.a = a;
	};	
	public String info() {
		return this.a;
	}
	
}

public class Java의정석연습문제62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("홍길동,1,1,100,60,76");
		String str = s.info();
		System.out.println(str);
	}

}

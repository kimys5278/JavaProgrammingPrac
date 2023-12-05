package JavaOOP;

class Data2{int a;}

public class Java기본형매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.a = 10;
		System.out.println(d.a);
		change(d.a);
		System.out.println(d.a);
		
		
	}
	static void change(int a) {
		a = 1000;
		System.out.println(a);
	}
	
}
//값을 읽고난후 초기화 되어서 다시 돌아온다. 값만 바뀌고, 주소는 그대로
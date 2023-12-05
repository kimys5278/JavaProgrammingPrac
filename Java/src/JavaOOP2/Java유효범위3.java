package JavaOOP2;

public class Java유효범위3 {
	static int i =5; // 전역변수
	
	static void a() {
		int i =10;
		b();
		
	}
	static void b() {
		int i =30;
		System.out.println(i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a();
	}

}

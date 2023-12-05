package JavaProgrammingClass;

public class Java2_1_출력 {
	int left, right;
	
	public void oper(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void mul() {
		System.out.println(this.left * this.right);
	}
	
	public void sub() { 
		System.out.println(this.left - this.right);
	}
	
	public static int sum(int n , int m) {
		//static -> 인스턴스없이 접근 가능.
		return n + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java2_1_출력 h = new Java2_1_출력();
		
		h.oper(10, 10);
		h.mul();
		h.sub();
		System.out.println("//////////////////////////////");
		int i = 10;
		int s ;
		char a;
		
		s = sum(i,20);
		a='?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		
		long m = 25;
		byte b = 127;
		System.out.println((float)m);
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
	
}
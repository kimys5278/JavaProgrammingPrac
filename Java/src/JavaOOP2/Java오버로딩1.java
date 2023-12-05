package JavaOOP2;

class calover {
	int a ,b;
	int third;
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void set(int a,int b,int third) {
		this.set(a, b);
//		this.a=a;
//		this.b=b; 주석 = 코드 중복 그래서 this.set(a,b)중복 제거
		this.third=third;
		
	}
	public void sum() {
		System.out.println(this.a+this.b+this.third);
	}
	public void avg() {
		System.out.println((this.a+this.b+this.third)/2);
	}
	
}

public class Java오버로딩1 {
//오버로딩 같은 이름의 메서드지만 다른 매개변수가 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calover c = new calover();
		c.set(20, 10);
		c.sum();
		c.avg();
		c.set(50, 10,10);
		c.sum();
		c.avg();

	}

}

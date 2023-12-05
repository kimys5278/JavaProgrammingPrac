package JavaOOP2;

class cal6{
	int a,b;
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void  sum() {
		System.out.println(this.a+this.b);
	}
	public int avg() {
		return (this.a+this.b)/2;
		
	}
	
}

class subcal6 extends cal6{
	public void sum() {
		System.out.println("sum의 실행결과:"+(this.a+this.b));
	}
	//오버라이딩의 조건 
	//1)메서드의이름이 같아야됨
	//2)메서드 매개변수숫자와 데이터 타입 그리고 순서가 같아야됨
	//3)메서드의 리턴타입이 같아야됨
	public int avg() {
		return super.avg();
	}
	
}

public class Java오버라이딩조건 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subcal6 sc = new subcal6();
		sc.set(60, 10);
		System.out.println(sc.avg());
		sc.sum();
	
		
	}

}

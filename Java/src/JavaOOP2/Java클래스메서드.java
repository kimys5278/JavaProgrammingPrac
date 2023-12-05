package JavaOOP2;


//인스턴스 메서드는 클래스 맴버에 접근 가능!!
//클래스 메서드는 인스턴스 맴버에 접근 불가능!!

class calculator3{
    // static이 붙은 클래스 메서드 인스턴스 필요없이 바로 접근하여 사용.
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void avg(int a, int b) {
		System.out.println((a+b)/2);
	}

}

public class Java클래스메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스메서드 호출 
		calculator3.sum(10, 10);
		calculator3.avg(50, 10);
		
	}

}

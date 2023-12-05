package JavaOOP2;

//인스턴스 메서드는 클래스 맴버에 접근 가능!!
//클래스 메서드는 인스턴스 맴버에 접근 불가능!!

class c1{
	static int static_variable =1;
	int instance_variable = 2;
	
	static void static_static() {
		System.out.println(static_variable);
		//클래스 메서드에서 클래스변수 호출-접근가능.
	}
	static void static_instance() {
//		System.out.println(instance_variable);
		//클래스 메서드에서 인스턴스변수 호출-접근불가능
	}
	void instance_static() {
		System.out.println(static_variable);
		//인스턴스메서드에서 클래스변수 호출-접근가능
	}
	
	void instance_instance() {
		System.out.println(instance_variable);
		//인스턴스메서드에서 인스턴스변수 호출-접근가능
	}
	
	
}

public class Java클래스인스턴스메서드관계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c1 c= new c1();
		
		c.static_static();
		//인스턴스 이용하여 정적메서드에 접근->성공
		//인스턴스 이용하여 정적변수에 접근->성공
	
		//c.static_instance();
		//인스턴스 이용하여 정적메서드에 접근->성공
		//인스턴스 이용하여 정적변수에 접근->실패
		
		c.instance_static();
		//인스턴스 이용하여 정적메서드에 접근->성공
		//인스턴스 이용하여 정적변수에 접근->성공
		
		c.instance_instance();
		//인스턴스 이용하여 정적메서드에 접근->성공
		//인스턴스 이용하여 정적변수에 접근->성공
		
		c1.static_static();
		//클래스 이용하여 정적메서드에 접근->성공
		//클래스 이용하여 정적변수에 접근->성공
		
		//c1.static_instance();
		//클래스 이용하여 정적메서드에 접근->성공	
		//클래스 이용하여 정적변수에 접근->실패
	
		//c1.instance_static();
		//클래스 이용하여 정적메서드에 접근->실패
		
		//c1.instance_instacne();
		//클래스 이용하여 인스턴스 메서드에 접근 -> 실패
		
	}

}

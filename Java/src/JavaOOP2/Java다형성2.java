package JavaOOP2;

class A {
	public String X() {
		return "x";
	}
}
class B11 extends A{
	public String y() {
		return "y";
	}
}

public class Java다형성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B11(); //중요 -> B클래스를  obj객체에 넣고 타입은 A클래스
		System.out.println(obj.X()); 
		//obj.y(); 이건 오류뜸 ->데이터타입이 A이고, A에는 y 메서드가 없기때문이다
		//클래스를 인스턴스화 시킬때 데이터타입을 자기 자신을 할 수도있고, 부모클래스를 할 수도 있다.
		//B클래스에서 A클래스를의 x를 오버라이딩한다면 B클래스의 x가 출력.

	}

}

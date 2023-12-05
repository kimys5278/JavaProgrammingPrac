package JavaOOP2;

abstract class A1{
	public abstract int b(); // 본체 x , 본체 = {}
	//본체가 있는 메서드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){System.out.println("Hello")} - >오류 본체를 가지고있음. {}
	//추상 클래스 내에서 추상 메서드가 아닌 메소드가 존재 할 수 있다.
	public void d() {
		System.out.println("world");
	}
}

class B extends A1{
	// 상속을 하는데 class A의 B 메서드는 앞에 abstract이 붙은 추상메서드이기 떄문에, 본체가 없다. {}가 없기 때문에 오버라이딩을 하여 본체를 만들어줘야함.
	public int b() {
		return 1;
	}
	
}

public class JavaAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj = new A();
		//오류뜸 - 추상클래스 abstract은 무조건 상속받아서 사용해야함.
		B b = new B();
		b.d();
		
	}

}
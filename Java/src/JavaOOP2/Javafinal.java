package JavaOOP2;

//추상이 상속을 강제하는 것 이라면 final은 상속/변경을 금지하는 규제. 정반대.
class Calculator2{
	static final double PI = 3.14;
	int left,right;
	
	public void setOperate(int left, int right) {
		this.left=left;
		this.right=right;
		//Calculator2.PI =3; - 오류 ->final 이 붙음.
		//즉 final이 붙은 변수의 값을 변경 할 수 없음.
	}
	
	public void add() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

//final 메서드
class aa{
	final void b() {};
}

class bb extends aa {
	//void b(); ->오류 final 메서드를 상속하려하기때문에 오류
}

//final 클래스
final class C{
	final void b() {};
}
//class D extends C{} -> 오류 final 클래스상속하려하기 떄문에 오류


public class Javafinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator2 cc = new Calculator2();
		cc.add();
		cc.avg();
		
	}

}

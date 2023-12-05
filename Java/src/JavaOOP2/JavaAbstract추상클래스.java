package JavaOOP2;
//추상클래스는 상속을 강제하기 위한 것이다. 

abstract class Calculator{
	int left,right;
	public void setOperate(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract void add();
	public abstract void avg();
	
	//코드중복을 없애기 위한 메서드
	//_sum의 접근제어자는 default임.->같은 패키지에서 사용가능.
	int _sum () {
		return this.left+this.right;
	}
	
	public void run () {
		add();
		avg();
	}
}

class CalculatorPlus extends Calculator{
	public void add() {
		System.out.println(" + sum : "+_sum());
	}
	public void avg() {
		System.out.println(" + avg : "+(this.left+this.right)/2);
	}
} 

//CalculatorPlus와 CalculatorMinos는 코드 중복이 일어난다.
//코드중복을 제거하기 위하여 sum의 연산 코드를 삭제하고 새로운 메서드를 만든다.

class CalculatorMinos extends Calculator{
	public void add() {
		System.out.println(" - sum : "+_sum());
	}
	public void avg() {
		System.out.println(" - avg : "+(this.left+this.right)/2);
	}
	
}

public class JavaAbstract추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorPlus cp = new CalculatorPlus();
		cp.setOperate(30, 20);
		cp.add();
		cp.avg();
		
		CalculatorMinos cm = new CalculatorMinos();
		cm.setOperate(30, 20);
		cm.add();
		cm.avg();
		
	}
	
}

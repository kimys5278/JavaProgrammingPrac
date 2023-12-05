package JavaOOP2;

abstract class CalculatorDeom{
	int left ,right;
	public void setoperate(int left, int right) {
		this.left = left;
		this.right=right;
	}
	public abstract void add();
	public abstract void avg();
	
	public void run() {
		add();
		avg();
	}	
}

class CalPlus extends CalculatorDeom{
	public void add() {
		System.out.println("+"+(this.left+this.right));
	}
	public void avg() {
		System.out.println("+"+(this.left+this.right)/2);
	}
}

class CalMinus extends CalculatorDeom{
	public void add() {
		System.out.println("-"+(this.left+this.right));
		
	}
	public void avg() {
		System.out.println("-"+(this.left+this.right)/2);
	}
	
}
public class Java다형성4_실전예제 {
	public static void excute(CalculatorDeom cal) {
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDeom cp = new CalPlus();
		cp.setoperate(30,30);
		cp.run();
		
		CalculatorDeom cm = new CalMinus();
		cm.setoperate(50, 50);
		cm.run();
		
		excute(cp);
		excute(cm);
		
	}
}
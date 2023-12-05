package JavaOOP2;



abstract class calprac{
	int a,b;
	
	public void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public abstract void add();
	public abstract void avg();
	
	public void run() {
		add();
		avg();
	}
	
}

class Plus1 extends calprac{
	public void add() {
		System.out.println("+ sum :"+(this.a+this.b));
	}
	public void avg() {
		System.out.println("+ avg :"+(this.a+this.b)/2);
	}
	
}

class Minos extends calprac{
	
	public void add() {
		System.out.println("- sum :"+(this.a+this.b));
	}
	
	public void avg() {
		System.out.println("- avg :"+(this.a+this.b)/2);
	}
	
}

public class JavaAbstract추상클래스연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plus1 p1 = new Plus1();
		p1.set(30, 10);
		p1.add();
		p1.avg();

		Minos m = new Minos();
		m.set(30, 10);
		m.add();
		m.avg();
	}

}
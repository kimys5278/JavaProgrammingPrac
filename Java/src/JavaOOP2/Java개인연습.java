package JavaOOP2;

class pracal{
	int a,b;
	public pracal(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return this.a+this.b;
		
	}
	
	public float avg() {
		return (this.a+this.b)/2; 
		
	}
	
}
class subprac extends pracal{
	public subprac(int a,int b) {
		super(a,b);
	}
	public int sub() {
		return this.a-this.b;
	}
}

public class Java개인연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subprac sp = new subprac(60,10);
		System.out.println(sp.add());
		System.out.println(sp.avg());
		System.out.println(sp.sub());
		
		
	}

}

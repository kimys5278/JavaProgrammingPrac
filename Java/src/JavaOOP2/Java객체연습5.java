package JavaOOP2;

class cal8{
	int a,b;
	int c;
	public void set(int a, int b) {
		this.a = a ;
		this.b = b;
		
	}
	public void set(int c) {
		this.set(a,b);
		this.c = c;
	
	}
	public int add() {
		return this.a+this.b+this.c;
	}
	
	public int sub () {
		return this.a-this.b+this.c;
	}
	
}

public class Java객체연습5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cal8 c = new cal8();
		c.set(10,20);
		c.set(30);
		System.out.println(c.add());
		System.out.println(c.sub());

	}

}

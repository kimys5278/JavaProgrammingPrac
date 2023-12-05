package JavaOOP2;

class calculatorr{
	int left,right;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void add() {
		System.out.println("sum : "+(this.left+this.right));
	}
	
	public void sub() {
   		System.out.println(this.left-this.right);
	}
	
} 

class claa extends calculatorr{
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

public class Javacalprac {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		claa c = new claa ();
		c.set(20, 10);
		c.add();
		c.sub();
		c.avg();
	}
}

package JavaOOP2;

class calcal{
	int left,right;
	static int a;
	public void set(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public static void n (int a) {
		System.out.println(a);
	}
	
	public void add() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

public class Java개인연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcal c = new calcal();
		c.set(30, 10);
		c.add();
		c.avg();
		calcal.n(5);
		
	}

}

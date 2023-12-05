package JavaOOP2;

class Cualculator1{
	//static붙으면 클래스변수이다. -> 모든인스턴스에서 동일한 값을 가진다.
	static double PI = 3.14;
	static int base = 0;
	
	int left, right;
	
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	public void sub() {
		System.out.println(this.left-this.right+base);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2+base);
		
	}
}

public class Java클래스인스턴스멤버 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cualculator1 c1 = new Cualculator1();
		System.out.println(c1.PI);
		c1.setOprands(10, 30);
		c1.sum();
		c1.avg();
		
		Cualculator1 c2 = new Cualculator1();
		System.out.println(Cualculator1.PI);
		c2.setOprands(50, 50);
		c2.sum();
		c2.avg();		
		
		System.out.println(Cualculator1.PI);
		
		Cualculator1.base=10;
		
		c1.sum();
		c1.avg();
		
		c2.sum();
		c2.avg();
		
	}

}

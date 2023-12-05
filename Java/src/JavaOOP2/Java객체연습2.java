package JavaOOP2;

class Cualculator{
	int left, right;
	
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
		
		//매개변수 와 전역변수이름이같아서 this를 씀. 
		//그러나 매개변수가 left,right가아닌 다른 이름이면 this를 안써도 출력됨.
		//밖에 전역변수와 접근되기 때문.
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
		
	}
}
public class Java객체연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cualculator c1 = new Cualculator();
		c1.setOprands(20, 20);
		c1.sum();
		c1.sub();
		c1.avg();
		

		System.out.println("############################");
		
		Cualculator c2 = new Cualculator();
		c2.setOprands(50, 50);
		c2.sum();
		c2.sub();
		c2.avg();
		
	}

}

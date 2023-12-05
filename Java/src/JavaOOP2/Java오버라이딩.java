package JavaOOP2;


class cal5{
	int left,right;
	
	public void set(int left,int right) {
		this.left =left;
		this.right=right;
	}
	
	public void sum () {
		System.out.println(this.left+this.right);
		
	}
	public void avg () {
		System.out.println((this.left+this.right)/2);
		
	}
	
}

class subcal5 extends cal5{
	public void sub() {
		System.out.println(this.left-this.right);
	}
	//오버라이딩 부모클래스에서 메서드를 가져와 재정의한다.
	public void sum() {
		System.out.println("sum의 실행결과: "+(this.left+this.right));
		
	}
	
}

public class Java오버라이딩 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subcal5 sc =new subcal5();
		sc.set(50,10);
		sc.sub();
		sc.sum();
	}

}

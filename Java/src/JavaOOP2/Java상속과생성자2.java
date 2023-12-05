package JavaOOP2;

class cal4{
	int left ,right;
	
	public cal4(int left,int right) {
		this.left = left;
		this.right = right; 
		
	}
	
	public void set (int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void add() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subcal4 extends cal4{
	//원래 기본생성자를 위에 만드는데, cal4라는 생성자를 개발자가 만들어서 상속이 안됨.
	//이럴때 방법 2가지 - 1)기본생성자를 만들어준다 public cal4(){}
	//부모클래스 생성자와 자식클래스 생성자가 같으면 (중복) - > 오류
	//자식클래스 생성자에서 상위클래스 생성자 호출 ->super() -> 부모클래스(super)의 ()=생성자를 의미
	//하위클래스만의 초기화코드는 super를 먼저 선언한 후 진행해야됨. !!! 중요 !!!
	public subcal4(int left,int right) {
		super(left,right);
	}
}

public class Java상속과생성자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subcal4 sc = new subcal4(50,10);
		sc.add();
		sc.avg();	
	}
}

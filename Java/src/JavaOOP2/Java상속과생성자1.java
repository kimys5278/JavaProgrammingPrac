package JavaOOP2;


class cal3{
	int left ,right;
	public void add() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class subcal3 extends cal3{
	public subcal3(int left,int right) {
		this.left = left;
		this.right = right;
	}
}

public class Java상속과생성자1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cal3에 기본생성자가 생성되어 가능
		subcal3 sc = new subcal3(50,10);
		sc.add();
		sc.avg();
	}

}

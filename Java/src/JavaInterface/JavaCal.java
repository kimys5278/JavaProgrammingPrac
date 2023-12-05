package JavaInterface;

// 만든 계산기는 2개의 매개변수를 가짐.
// 컨슈머는 3개를 가짐.
// so. 프로젝트 진행중 케뮤니케이션 미스 -> 다시 맞춰야됨
// 약속 체결 -> 코드로는 인터페이스
class Cal implements Calculatorable{
	int first,second,third;
	public void set(int first,int second,int third) { 
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public int sum() {
		return this.first+this.second+this.third;
	}
	public int avg() {
		return (this.first+this.second+this.third)/2;
	}
}

public class JavaCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

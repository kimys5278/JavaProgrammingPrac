package JavaInterface;
// 계산기 클래스 나오기 전까지 사용할 모조 클래스임.
// 컨슈머와 모조클래스는 3개의 매개변수가 있음.
// 만들어진 진짜 클래스와 컨슈머가 다름 -> 커뮤니케이션 실패
// 인터페이스를 이용하여 해결-> 하나의 약속생성.
// 인터페이스 사용하여 문제해결

class CalDummy implements Calculatorable{
	public void set(int first,int second, int third) {
		
	}
	public int sum() {return 60;}
	public int avg() {return 20;}
	
}

public class JavaCalConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal c = new Cal();
		c.set(1000, 1000, 1000);
		System.out.println(c.sum()+c.avg());

	}

}

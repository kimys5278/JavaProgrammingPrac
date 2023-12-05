package JavaOOP;

abstract class Players{// 추상 클래스 -> 미완성 설계도
	abstract void play(int pos);//추상메서드 -> 몸통 없는 추상 메서드
	abstract void stop();
}

//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class Audioplayer extends Players{
	void play(int pos) {System.out.println(pos+"위치부터 시작합니다.");}
	void stop(){System.out.println("재생을 중지합니다.");}
	
}

public class Java_추상메서드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players ap = new Audioplayer(); //다형성
		ap.play(100);
		ap.stop();
		
		
	}

}

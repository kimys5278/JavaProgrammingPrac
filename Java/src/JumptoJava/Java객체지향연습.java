package JumptoJava;

public class Java객체지향연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t;
		t = new Tv();
		t.channel = 7 ;
		t.channeldown();
		
		System.out.println("현재의 채널은"+t.channel+"입니다.");
		
		
	

	}

}

class Tv {
	//멤버변수
	String color;
	int channel;
	boolean power;
	
	//메서드
	void power(){power = !power;}
	void channelup() {++channel;}
	void channeldown() {--channel;}
	
	
}
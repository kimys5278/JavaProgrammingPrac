package JavaOOP;
class tv {
	int channel;
	int button_num;
	boolean power;
	String color;
	
	void channelUP() {++channel;}
	void channelDown () {--channel;}
	void power () {power =!power;}	
}


public class Java객체생성과사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tv t1 = new tv ();
		tv t2 = new tv ();
		
		t1.channel = 8;
		System.out.println("t1의 채널은"+t1.channel+"입니다.");
		System.out.println("t1의 채널은"+t2.channel+"입니다.");
		t2.channel = 10;
		t2.channelDown();
		System.out.println("t1의 채널은"+t2.channel+"입니다.");

	}

}

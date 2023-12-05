package JavaProgrammingClass;

interface PhoneInterface{
	final int TIMEOUT=10000;
	public static final int TILTEOUT=10000;
	 void sendcall();
	 void receiveCall();
	 default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamsungPhone  implements PhoneInterface{

	@Override
	public void sendcall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리링");
	}
	
	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
	
}
public class Java5_6_인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendcall();
		phone.receiveCall();
		phone.flash();
		
	}

}

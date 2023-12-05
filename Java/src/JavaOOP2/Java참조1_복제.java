package JavaOOP2;

public class Java참조1_복제 {
	public static void runValue() {
		int a = 1;
		int b = a;
		b=2;
		//b에 어떤 수를 넣어도 a는 바뀌지 않는다.
		System.out.println("runValue,"+a);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();

	}

}

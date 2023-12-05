package JavaOOP2;

public class Java오버로딩2 {
	void a () {System.out.println("void a()");}
	void a(int arg1) {System.out.println("void a(int arg1)");}
	void a(String arg1){System.out.println("void a(String arg1)");}
	//int a (){System.out.println("void a());}

	//int a()는 오류 - 그이유 -> void a()와 매개변수와 이름이 같고, 타입이 달라서 호출할때, 이름이 같기때문에 오류뜸.
	//타입과 이름이 같지만, 매개변수가 다르면 그것도 오류. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java오버로딩2 c = new Java오버로딩2();
		c.a();
		c.a(1);
		c.a("HI");
		//오버라이딩과 오버로딩은 개념은 완전 다름!
	}

}

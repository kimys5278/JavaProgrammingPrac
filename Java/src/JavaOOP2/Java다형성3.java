package JavaOOP2;

class AA1{
	public String x() {return "A.x";}
	}
class B1 extends AA1{
	
	public String x() {return "B.x";}
	
	public String y() {return "B.y";}
}

class B2 extends AA1{
	public String x() {return "B2.x";}
}

public class Java다형성3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA1 obj1 = new B1();
		AA1 obj2 = new B2();
		System.out.println(obj1.x());
		System.out.println(obj2.x());
		
	}

}

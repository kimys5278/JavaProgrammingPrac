package JavaOOP2;

interface I2{
	public String A(); 
	
}
interface I3{
	public String B(); 
	
}

class D implements I2,I3{
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}
public class Java다형성5_인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D obj1 =new D();
		I2 obj2 = new D();
		I3 obj3 = new D();
		
		System.out.println(obj1.A());
		System.out.println(obj1.B());
		
		System.out.println(obj2.A());
		//System.out.println(obj2.B());
		
		//System.out.println(obj3.A());
		System.out.println(obj3.B());
	}

}

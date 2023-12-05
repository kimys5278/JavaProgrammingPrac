package JavaVariable;

class Human {
	protected String test() {
		return "test";
	}
	
}
class Studentss extends Human implements Cloneable{
	/* Clone을 구현 하더라도 오류가뜸. -> Clone의 접근제어자는 protect
	 * protect는 서로다른 패키지에서는 호출 안됨.
	 * 그러나 상속은가능
	 */
	String name ;
	Studentss(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
 
public class JavaClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentss s1 = new Studentss("kim");
		System.out.println(s1.test()); 
		/*에러 ->해결: colne이 Studentss 클래스에 복제가능하도록 해야함.
		 * cloneable구현.
		 */
		try {
			Studentss s2 = (Studentss)s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}

	}

}

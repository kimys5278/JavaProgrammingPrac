package JavaOOP;

class tiger{
	String lang = "어흥";
}
class dog{
	String lang = "멍멍";
}
class lion{
	String lang = "으르렁";
}

class Bark{
	
	//메서드 오버로딩
	void bark(tiger t) {
		System.out.println(t.lang);
	}
	void bark(dog d) {
		System.out.println(d.lang);
	}
	void bark(lion l) {
		System.out.println(l.lang);
	}
	
}
public class Java_매개변수의다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger t = new tiger();
		dog d = new dog();
		lion l =new lion();
		
		Bark b = new Bark();
		b.bark(t);
		b.bark(d);
		b.bark(l);
		
		//여기서 cat 클래스 추가하면 코드를 엄청 추가해야 한다.
		//그래서 인터페이스를 활용하여 매개변수의다형성2에서 다시구현하겠다. 
	}

}

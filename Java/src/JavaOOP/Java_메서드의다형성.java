package JavaOOP;

class Bumo {
	// 오버로딩
	public void print(int value) {
		System.out.println("숫자 출력 = " + value);
	}
   	// 오버로딩
	public void print(String value) {
		System.out.println("문자 출력 = " + value);
	}
    
    public void add(int x, int y) {
		System.out.println(x + y);
	}
}

class Jasik extends Bumo {
	// 오버라이딩
	public void add(int x, int y) {
		System.out.println((x + y) * 2);
	}
}
public class Java_메서드의다형성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bumo p = new Bumo();
        p.print(100);     // 결과 : 숫자 출력 = 100 (오버로딩)
		p.print("test");   // 결과 : 문자 출력 = "test" (오버로딩)
        p.add(1,2); // 결과 : 3
        
        Bumo p2 = new Jasik();
        p2.add(1,2); // 결과 : 6 (오버라이딩)
	}

}

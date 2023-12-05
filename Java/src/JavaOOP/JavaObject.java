package JavaOOP;

// Object는 모든 클래스의 최고 조상 
//  Object로부터 상속받은 여러가지 (to.string())같은 메서드 사용가능
class point2 extends Object {
	int x; 
	int y;
}

//상속
/* class circle extends point{
	int r;
	
}
*/

// 포함
class circle3 extends Object {
	point2 p = new point2(); // 참조변수의 초기화
	int r ; 
	
}

public class JavaObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle3 c = new circle3 ();		
		System.out.println(c.toString()); //circle2@5ca881b5 객체 주소값을 찍어줌.
		
		circle3 c2 = new circle3 ();		
		System.out.println(c2); //circle3@24d46ca6 객체 주소값을 찍어줌. println은 참조변수만 써도 객체주소줌

 
	}

}

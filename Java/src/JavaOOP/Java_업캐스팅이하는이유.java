package JavaOOP;

class Shape{
	
}

class Circle extends Shape{
	
}

class Rect extends Shape{
	
}

class Triangle extends Shape{
	
}

public class Java_업캐스팅이하는이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//하나씩 만들어야 됨.
		Shape [] s = new Shape[10];
		s[0] = new Circle();
		s[1] = new Circle();
		s[2] = new Rect();
		s[3] = new Rect();
		s[4] = new Triangle();
		s[5] = new Triangle();
		
		
		
	}

}

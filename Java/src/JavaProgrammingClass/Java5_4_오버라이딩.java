package JavaProgrammingClass;

class Shape{
	public  Shape next;
	public Shape() {next = null;}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circleq extends Shape{
	public void draw(){
		System.out.println("Circle");
	}
}


public class Java5_4_오버라이딩 {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect()); 
		paint(new Circleq());
		
	}

}

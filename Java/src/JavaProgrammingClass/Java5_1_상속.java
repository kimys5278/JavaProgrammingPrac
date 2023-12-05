package JavaProgrammingClass;

class Point{
	private int x, y;
	public void set(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
	
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}

public class Java5_1_상속 {
	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 생성
		p.set(1, 2); // Point 클래스의 set() 호출
		p.showPoint();
		ColorPoint cp = new ColorPoint(); // ColorPoint 객체
		cp.set(3, 4); // Point의 set() 호출
		cp.setColor("red");
		// ColorPoint의 setColor(
		cp.showColorPoint(); // 컬러와 좌표 출력
	}
}

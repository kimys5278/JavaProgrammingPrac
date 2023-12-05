package JavaProgrammingClass;

class PointA{
	private int x,y;
	public PointA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class ColorPointA extends PointA{
	String color;
	public ColorPointA(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return color+"색의"+"("+getX()+","+getY()+")의 점";
	}

}


public class Java실습문제5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPointA cp = new ColorPointA(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
		
	}

}

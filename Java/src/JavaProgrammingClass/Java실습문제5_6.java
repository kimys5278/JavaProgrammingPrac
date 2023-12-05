package JavaProgrammingClass;

class PointB{
	private int x,y;
	public PointB(int x, int y) {
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

class ColorPointB extends PointB{
	String color;
	public ColorPointB(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public ColorPointB() {
		super(0,0);
		this.color = "black";
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
public class Java실습문제5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPointB cp = new ColorPointB(5,5,"YELLOW");
		ColorPointB zeropoint = new ColorPointB();
		System.out.println(zeropoint.toString()+"입니다.");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
		
	}
}

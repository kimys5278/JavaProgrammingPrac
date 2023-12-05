package JavaProgrammingClass;

class PointC{
	private int x,y;
	protected int z;
	public PointC(int x, int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	protected void move(int x, int y,int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}

class ColorPointC extends PointC{
	String color;
	public ColorPointC(int x, int y, int z) {
		super(x,y,z);
	}
	
	public void moveUp() {
		 z++;
	}
	
	public void moveDown() {
		z--;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")점";
	}

}

public class Java실습문제5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPointC cp = new ColorPointC(5,5,5);
		cp.moveUp();
		System.out.println(cp.toString()+"입니다.");
		cp.moveDown();
		System.out.println(cp.toString()+"입니다.");
		cp.move(100,100,100);
		System.out.println(cp.toString()+"입니다.");
	}

}

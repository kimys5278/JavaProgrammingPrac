package JavaProgrammingClass;

class ppoints{
	int x, y ;
	
	public ppoints (int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public void showpoint() {
		System.out.println("x: "+x+" y: "+y);
	}
	
}

class ccpoint extends ppoints{
	String color ;
	public ccpoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void showcolor() {
		System.out.println("color: "+color);
		showpoint();
	}
	
}

public class Java상속Prac2_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ccpoint c = new ccpoint(3,4,"yellow");
		c.showcolor();
	}

}



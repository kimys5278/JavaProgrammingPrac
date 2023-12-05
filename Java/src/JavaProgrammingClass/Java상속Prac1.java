package JavaProgrammingClass;

class Inpoint{
	
	int x;
	int y;
	public void set(int x, int y) {
		this.x = x;
		this.y= y;
	}
	
	public void runp() {
		System.out.println("x: "+x+" y "+y);
	}
	
}

class Inpointcolor extends Inpoint{
	String color;
	public void color(String c) {
		this.color = c;
	}
	
	public void runc() {
		System.out.println("color = "+color);
		runp();
	}
}

public class Java상속Prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inpointcolor ic = new Inpointcolor();
		ic.set(3,5);
		ic.color("red");
		ic.runc();
	}

}

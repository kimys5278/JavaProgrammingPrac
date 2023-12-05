package JavaProgrammingClass;

class SuperObject{
	public void paint() {
		draw();
	}
	public void draw() {
		draw();
		System.err.println("SuperObject");
	}
}

class SubOject extends SuperObject{
	@Override
	public void paint() {
		super.draw();
	}
	@Override
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class Java_ChckTime5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperObject b = new SubOject();
		b.paint();
		System.out.println("=================================");
		SubOject c = new SubOject();
		c.paint();
		
		
	}

}

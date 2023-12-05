package JavaProgrammingClass;

class Circle{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}

public class Java4_4클래스와객체_객체배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle []c = new Circle[5];
		for(int i =0;i<c.length;i++) {
			c[i] = new Circle(i);
		}
		for(int i =0;i<c.length;i++) {
			System.out.println((int)(c[i].getArea())+" ");
		}
	}

}

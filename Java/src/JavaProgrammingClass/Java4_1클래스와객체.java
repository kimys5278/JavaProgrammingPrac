package JavaProgrammingClass;

class Ccle{
	int radius;
	String name;
	
	public Ccle() {}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}

public class Java4_1클래스와객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ccle pizza = new Ccle();
		pizza.radius = 10;
		pizza.name="자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Ccle donut = new Ccle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적으 "+area);
		

	}

}

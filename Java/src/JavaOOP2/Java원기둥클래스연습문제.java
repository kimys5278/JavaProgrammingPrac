package JavaOOP2;

class Cylinder{
	static double PI=3.14; 
	double radius,height;
	public void set(double radius, double height) {
		
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume(){
		return this.radius*this.radius*this.height*PI;
	}
	
	public double getArea() {
		return (this.radius*this.radius)*2*PI+(this.radius*2)*this.height*PI;
	}
	
	
}
public class Java원기둥클래스연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder cy = new Cylinder();
		cy.set(4, 5);
		System.out.println(cy.getVolume());
		System.out.println(cy.getArea());
		
	}

}

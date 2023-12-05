package JavaProgrammingClass;

import java.util.Scanner;

class CCircle{
	private double x,y;
	private int radius;
	
	public CCircle(double x,double y , int radius ) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	
}

public class Java실습문제4_5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CCircle[] c = new CCircle[3];
		for( int i =0; i<c.length;i++) {
		System.out.println("x,y,radius >>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		int radius = sc.nextInt();
		
		c[i] = new CCircle(x,y,radius);
		}
	
		for (int i =0;i<c.length;i++) {
			c[i].show();
		}
		sc.close();
		
	}
	

}

package JavaProgrammingClass;

import java.util.Scanner;

class CCircle2 {
	private double x,y;
	private int radius;
	
	public CCircle2(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.print("가장 면적이 큰 원은("+x+","+y+")"+radius);
	}
	
}

public class Java실습문제4_6번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CCircle2[] c = new CCircle2[3];
		
		for(int i =0;i<c.length;i++) {
			System.out.print("x,y,radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			
			c[i] = new CCircle2(x,y,radius);
		}
		for(int i =0;i<c.length;i++) {
			c[i].show();
		}
		sc.close();
		
	}

}

package JavaProgrammingClass;

import java.util.Scanner;

class Rectangle{ 
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
}
public class Java4_2클래스와객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rc = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		
		rc.width = sc.nextInt();
		rc.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 "+rc.getArea()+" 입니다.");
		sc.close();
		

	}

}

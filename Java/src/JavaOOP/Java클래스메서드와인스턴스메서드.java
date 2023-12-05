package JavaOOP;

import java.nio.file.spi.FileSystemProvider;

class mymath{
long a , b;

//클래스 메서드 작성
static long add (long a , long b) { return a+b ; }

//인스턴스 메서드 작성
long add () {return a+b ;}




}
public class Java클래스메서드와인스턴스메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//클래스 메서드 호출
		System.out.println(mymath.add(10, 20));	
		
		
		
		//인스턴스 메서드 호출
		mymath mm = new mymath();
		mm.a = 10;
		mm.b = 10;
		System.out.println(mm.add());

	}

}

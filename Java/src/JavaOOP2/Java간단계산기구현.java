package JavaOOP2;

import java.util.Scanner;

class cal {
	int a,b;
	
	public void set() {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		this.a = a;
		this.b = b;
		
	}
	
	public void sum () {
		System.out.println(this.a+this.b);
		
	}
	
	public void sub () {
		System.out.println(this.a-this.b);
		
	}
	public void mul () {
		System.out.println(this.a*this.b);
		
	}
	public void div () {
		System.out.println(this.a/this.b);
		
	}
	public void nam () {
		System.out.println(this.a%this.b);
		
	}
	
	
}

public class Java간단계산기구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cal c = new cal();
		c.set();
		c.sum();
		c.sub();
		c.mul();
		c.div();
		c.nam();
		
		
		

	}

}

package JavaOOP;

public class JavaSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//super - 조상멤버와 자신멤버를 구별할때 사용
		//this - lv와 iv구별에 사용
    child c = new child();
    c.method();

    
    		

	 }
}

class Parents{
	int x = 10;
}

class child extends Parents{
	int x = 20;
	
	void method() {
	   System.out.println("x = "+ x);
	   System.out.println("this.x = "+ this.x );
	   System.out.println("super.x = "+ super.x);
		
	}
}
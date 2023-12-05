package JavaOOP;

class num {int x;}

public class Java참조형반환타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num n1= new  num();
		n1.x=10;

		num n2 = copy(n1);
		System.out.println("n1.x="+n1.x);
		System.out.println("n2.x="+n2.x);

    
   }
	static num copy(num n1) {
		num tmp = new num();
		tmp.x= n1.x;
		return tmp ;
		
	}

	
	
}

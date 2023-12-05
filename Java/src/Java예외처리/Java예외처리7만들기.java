package Java예외처리;

class Calculratorr3{
	int left,right;
	public void set(int left,int right) {
//		if(right ==0) {
//			throw new IllegalArgumentException("두 번째 인자는 0을 허용하지 않습니다.");
//		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new ArithmeticException("0으로 나눌수 없습니다.");
		}
		try {
		System.out.println("계산결과는");		
		System.out.println(this.left/this.right);
		System.out.println("입니다.");
		} catch(Exception e) {
		System.out.println("/n/ne.Exception()"+e.getMessage());		 
		System.out.println("\n\ne.toString()"+e.toString());
		System.out.println("\n\ne.printStackTrace");
		e.printStackTrace();
				
		}
	}
}
public class Java예외처리7만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculratorr3 c =new Calculratorr3();
		c.set(10, 0);
		try {
			c.divide();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}

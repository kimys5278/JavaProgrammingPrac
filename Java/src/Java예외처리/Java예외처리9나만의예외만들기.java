package Java예외처리;

//checked -> Exception
class DivideException extends Exception{
	public int left;
	public int right;

	DivideException(String message){
		super(message);
	}
	DivideException(String message,int lefr,int right){
		super(message);
		this.left = left;
		this.right = right;
	}
}

//unchecked -> RuntimeException
//class DivideException extends RuntimeException{
//	DivideException(){
//		super();
//	}
//	DivideException(String message){
//		super(message);
//	}
//}
class Calculatorr4{
	int left,right;
	public void set(int left,int right) {
		this.left = left;
		this.right = right;
	}
	public void divide() throws DivideException{
		if(right == 0 ) {
			throw new DivideException("0으로 나눌 수 없습니다.",this.left,this.right);
		}
		/////////////////////////////////////////
//		try {
//		if(right == 0) {
//			throw new DivideException("0으로 나눌 수 없습니다.",this.left,this.right);
//		}
//		System.out.println(this.left/this.right);
//		}catch(DivideException e) {
//			e.printStackTrace();
//		}
		/////////////////////////////////////////
//		try {
//			System.out.println("계산결과는");
//			System.out.println(this.left/this.right);
//			System.out.println("입니다.");
//		}catch(Exception e) {
//			System.out.println("\n\ne.Exception"+e.getMessage());
//			System.out.println("\n\ne.toString"+e.toString());
//			System.out.println("\n\ne.printStackTrace");
//			e.printStackTrace();
//			
//		}
		////////////////////////////////////////
	}
}

public class Java예외처리9나만의예외만들기 {
	//자신만의 Exception을 만들땐 먼저checked,unchecked를 결정해야된다.
	//checked -> 어떤 에외가 발생했을때, 무언가를 개선의여지가 있을때.
	//unchecked -> 예외 상황에서 할 수있는것이 없고, 프로그램을 그냥 종료하는 것이 덜 위험할 때 사용.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculatorr4 c = new Calculatorr4();
		c.set(10, 0);
		try {
			c.divide();
		}catch(DivideException e){
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}


}

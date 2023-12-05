package Java예외처리;

class arr2 {
	private int []arr = new int[3];
	arr2() {
	arr[0] = 0;
	arr[1] = 10;
	arr[2] = 20;
	}
	public void z ( int first, int second) {
		try {
		System.out.println(arr[first]/arr[second]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException e");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException e");
		}catch(Exception e) {
			System.out.println("Other Exception");
		}finally {
			//finally 오류가 발생하든 안하든 그냥 코드 실행됨.
			//언제사용? 
			//자바 어플리케이션이 데이터베이스에 접속해서 가져올때,
			//데이터베이스에서 접속이 개수 이상 늘어나면서, 접속이 끊어질수 있으므로,
			//일정 개수가 도달했을때, 끊어줄 때 사용. 한가지 예임
			System.out.println("finally");
		}
	}	
	
}

public class Java예외처리4finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr2 a = new arr2();
		a.z(10, 0);
		a.z(1, 0);
		a.z(2, 1);
	}

}

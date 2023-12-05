package Java예외처리;

class arr1{
	private int [] arr = new int[3];
	arr1() {
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
		}
	}	
}

public class Java예외처리3다양한예외 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr1 a = new arr1();
		a.z(10, 1);
	}

}

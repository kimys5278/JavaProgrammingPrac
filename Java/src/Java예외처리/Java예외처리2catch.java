package Java예외처리;

class Caluratorr2{
	int left,right;
	public void setoperate(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		//catch 문에서 코드가 아래로 갈수록 더 자세한 오류정보를 표기한다.
		try {
			System.out.println("계산결과는");
			System.out.println(this.left/this.right);
			System.out.println("입니다.");
		}catch(Exception e) {
			System.out.println("\n\ne.getMessage()"+e.getMessage());
			System.out.println("\n\ne.toString()"+e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		System.out.println("Divide End");
	}
}

public class Java예외처리2catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluratorr2 c = new Caluratorr2();
		c.setoperate(10, 0);
		c.divide();
	}

}

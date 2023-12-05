package Java예외처리;

class Caluratorr{
	int left,right;
	public void setoperate(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
//		계산결괴는 오류가 발생했습니다./ by zero
		try {
		System.out.println("계산결괴는");
		System.out.println(this.left/this.right);
		System.out.println("입니다.");
		}
		catch(Exception e) {
			System.out.println("오류가 발생했습니다."+e.getMessage());
		}
	}
	
}
public class Java예외처리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluratorr c = new Caluratorr();
		c.setoperate(6, 0);
		c.divide();
		
	}

}

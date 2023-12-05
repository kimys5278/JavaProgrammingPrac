package JavaOOP2;



public class Java객체연습1 {
	//메서드 
	public static void sum(int left, int right) {
		System.out.println(left+right);
		
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left, right;
		left = 10;
		right = 30;
		
		sum(left,right);
		avg(left,right);
		
		left = 50;
		right = 50;
		
		sum(left,right);
		avg(left,right);
		
		
		}
}

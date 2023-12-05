package JavaOOP2;

class dis{
	
	public static void  getDistance(int x,int y,int x1,int y1) {
		 System.out.println(Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)));
		
	}
	
}
public class Java의정석6장연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dis d = new dis();
		d.getDistance(1,1,2,2);
		
	}

}

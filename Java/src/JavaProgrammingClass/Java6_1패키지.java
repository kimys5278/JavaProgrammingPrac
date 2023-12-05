package JavaProgrammingClass;

class SPoint{
	
	private int x,y;
	public SPoint( int x , int y) {
		this.x = x ;
		this.y = y;
	}
}

public class Java6_1패키지 {

	public static void print(Object obj) {

		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		
	}
	public static void main(String[] args) {
		SPoint p = new SPoint(2,3);
		print(p);
	}

}

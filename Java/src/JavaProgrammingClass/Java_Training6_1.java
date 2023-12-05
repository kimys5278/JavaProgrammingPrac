package JavaProgrammingClass;

class Myp{
	int x, y;
	public Myp(int x ,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
	
}

public class Java_Training6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myp p =new Myp(3,30);
		Myp q =new Myp(4,30);
		System.out.println(p.toString());
		if(p.equals(q))
			System.out.println("같은점");
		else
			System.out.println("다른 점");
	}

}

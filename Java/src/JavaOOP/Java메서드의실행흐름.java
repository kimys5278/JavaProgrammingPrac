package JavaOOP;

public class Java메서드의실행흐름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sr s = new sr();
		pie p = new pie ();
		int width = s.sr(3, 6);
		double pie1 = p.pie(5); 
		System.out.println(width);
		System.out.println(pie1);
		


	}

}
class sr{
	int sr(int x,int y) {return (x*y)/2;  }	
}
class pie{
	double pie(double x) {return x*x*3.14;}
}
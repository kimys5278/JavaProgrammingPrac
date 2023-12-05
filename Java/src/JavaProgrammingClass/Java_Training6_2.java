package JavaProgrammingClass;

class Won{
	int x,y,z;
	public Won(int x , int y, int z ) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public String toString() {
		return "Won ("+x+","+y+")"+"반지름:"+z;
	}
	
	public boolean equals(Object obj) {
		Won w = (Won)obj;
		if(w.x == x && w.y == y) {
			return true;
		}
			
		else
			return false;
	}
}

public class Java_Training6_2 {
	public static void main(String[] args) {
		Won a = new Won(2,3,5);
		Won b = new Won(2,3,30);
		System.out.println("원 a: "+a);
		System.out.println("원 b: "+b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}else {
			System.out.println("다른 원");
		}
	}
	

}

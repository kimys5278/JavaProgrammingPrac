package JavaProgrammingClass;

class Dot{
	private int x,y;
	public Dot(int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		Dot d = (Dot)obj;
		if(x==d.x && y==d.y) {
			return true;
		}else {
			return false;
		}
	}
}

class Java6_2패키지와모듈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dot a = new Dot(2,3);
		Dot b = new Dot(2,3);
		Dot c = new Dot(3,4);
		
		if(a==b) {
			System.out.println("a==b");
			}
		if(a.equals(b)) {
			System.out.println("a is equals b");
			}
		if(a.equals(c)) {
			System.out.println("a is equals c");
		}
		
	}

}

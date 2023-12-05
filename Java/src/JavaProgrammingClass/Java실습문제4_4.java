package JavaProgrammingClass;

class Rectangless{
	int x;
	int y;
	int width;
	int height;
	
	public Rectangless(int x,int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	public int square() {
		
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+"에서 "+width+"X"+height+" 인 사각형");
	}
	public boolean contains(Rectangless r) {
		if(x<r.x && y <r.y) {
			if((width+x)>(r.x+r.width) && (height+y)>(r.y+r.height)) {
				return true;
			}
		}
		return false;
	}
}

public class Java실습문제4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangless r = new Rectangless(2,2,8,7);
		Rectangless s = new Rectangless(5,5,6,6);
		Rectangless t = new Rectangless(1,1,10,10);
		
		r.show();
		
		System.out.println("s의 면적은 "+s.square()+" 입니다.");
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s을 포함합니다.");
		}

	}

}

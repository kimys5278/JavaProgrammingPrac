package JavaProgrammingClass;

class TVs{
	private int size;
	public TVs(int size) {
		this.size = size;
	}
	protected int getsize() {
		return size;
	}
}

class ColorTV extends TVs{
	private int c;
	public ColorTV(int size,int c) {
		super(size);
		this.c = c;
	}
	protected int getcolor() {
		return c;
	}
	public void printpo() {
		System.out.println(getsize()+" 인치 "+c+" 컬러");
	}
	
	
}

class IPTV extends ColorTV{
	private String juso;
	public IPTV(int size,int c, String juso) {
		super(size, c);
		this.juso=juso;
	}
	public void printpo() {
		System.out.println(juso+" 주소 "+getsize()+" 인치 "+getcolor()+" 컬러");
	}
}

public class Java실습문제5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV mytv = new IPTV(32,1024,"1.486.15");		
		mytv.printpo();

	}

}


package JavaOOP2;

class cal2{
	
	int left,right;
	
	public void set (int left,int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}
//subcal가 cal2 클래스 상속
class subcal extends cal2{
	
	public void sub() {
		System.out.println(this.left-this.right);
		
	}
	
}
//mulcal클래스가 subcal클래스 상속
class mulcal extends subcal {
	
	public void mul() {
		System.out.println(this.left*this.right);
	}
	
}

//div클래스가 mulcal클래스 상속
class divcal extends mulcal{
	
	public void div() {
		System.out.println(this.left/this.right);
	}
}

public class Java상속1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cal2 -> sub -> mul -> div 
		//div가 모든 클래스 사용가능
		divcal dc = new divcal();
		dc.set(50, 10);
		dc.sum();
		dc.avg();
		dc.sub();
		dc.mul();
		dc.div();

	}

}
package Java생활코딩;

import Java생활코딩접근제어자other.JavaOther;
import Java생활코딩접근제어자other.Nothing;

class Sameclasschecker{
	public Sameclasschecker(){
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	private void _private() {
		System.out.println("private");
	}
	public void _public() {
		System.out.println("public");
	}
	protected void _protected() {
		System.out.println("protected");
	}
	void _default() {
		System.out.println("default");
	}
}

class SamePackgaeChecker extends JavaSame{
	public SamePackgaeChecker() {
	JavaSame same = new JavaSame();
	same._public();
	same._protected();
	same._default();
//	same._private();

	this._public();
	this._protected();
	this._default();
//	this._private();
	}	
}

class OtherPackgeChecker extends JavaOther{
	public OtherPackgeChecker() {
		JavaOther other = new JavaOther();
		other._public();
//		other._protected();
//		other._default();
//		other._private();
		
		this._public();
		this._protected();
//		this._default();
//		this._private();
		
		Nothing n = new Nothing();
		other._public();
//		other._protected();
//		other._default();
//		other._private();
		
		
		
		
		
	}
	
	
}
public class Javachecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

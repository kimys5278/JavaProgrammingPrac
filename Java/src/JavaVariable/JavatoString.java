package JavaVariable;

// class Calobj extends Object중  Object 상속을 생략하고 있는 것이다. 
class Calobj{
	int left,right;
	
	public void set (int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void add() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	//toString() 재정의
	public String toString() {
		return super.toString()+"\nleft:"+this.left+", right:" + this.right;
		/*super 쓰는  이유 
		 * // class Calobj extends Object중  Object 상속을 생략하고 있는 것이다. 
		 * toString 은 Object(부모클래스)안에 있는 메서드이므로, 
		 * super로 가져와야한다. 
		 */
	}
	
}
public class JavatoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calobj c = new Calobj();
		c.set(10, 2);
		System.out.println(c);
		System.out.println(c.toString());
		//toString 어떠한 객체를 문자열로.c만 적으면 toString이 생략
		c.add();
		c.avg();

	}

}

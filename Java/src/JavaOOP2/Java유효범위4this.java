package JavaOOP2;

class cc{
	int v = 10; //전역변수
	
	void m(){
		int v = 20; // 지역변수 전역변수보다 우선순위가 높아서 지역변수가 출력됨.
		System.out.println(v);
		System.out.println(this.v); //전역변수 출력하려면 this.을 붙힘.
		
	}
}

public class Java유효범위4this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cc c1 = new cc();
		c1.m();
		
	}

}

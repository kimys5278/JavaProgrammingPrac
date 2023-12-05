package JavaOOP2;
//오버로딩 예와 비슷 -> 메서드를 통한 다형성
class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
	
}

public class Java다형성1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.a(1);
		o.a("one");
		
		
		
		
	}

}

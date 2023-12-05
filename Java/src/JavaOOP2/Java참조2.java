package JavaOOP2;

class A7{
	public int id;
	A7(int id){
		this.id=id;
	}
	
}

public class Java참조2 {
	public static void runValue() {
		//기본 데이터 타입 -> 복제
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue,"+a);
	}
	public static void runReference() { 
		//기본데이터 타입이아닌 데이터타입은 참조-> 주소값만 가지고 있기 때문.
		A7 a = new A7(5);
		A7 b = a;
		b.id = 2;
		System.out.println("runReference,"+a.id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		runReference();
	}

}

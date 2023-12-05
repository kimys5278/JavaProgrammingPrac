package JavaOOP2;

class AAA{
	public int id;
	
	AAA(int id){
		this.id = id;
	}
	
}

public class Java참조3 {
	
	public static void runValue(){
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue,"+a);
	}
	
	public static void runReferencre() {
		AAA a = new AAA(5);
		AAA b = a;
		b = new AAA(2);
		b.id =2;
		System.out.println("runReference,"+a.id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runValue();
		runReferencre();
		
	}

}

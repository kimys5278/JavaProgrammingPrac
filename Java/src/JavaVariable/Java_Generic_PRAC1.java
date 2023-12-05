package JavaVariable;

class Gene <T>{
	public T info;
	
	public void set(T info) {
		this.info = info;
	}
	
	public T get() {
		return info;
	}

}

public class Java_Generic_PRAC1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gene<String> a =new Gene<String>();
		Gene<Integer> b =new Gene<Integer>();
		a.set("nadocoding");
		b.set(10);
		
		System.out.println("a data: "+a.get());
		//변환된 데이터 타입 출력
		System.out.println("a T type: "+ a.get().getClass().getName());
		System.out.println();
		System.out.println("b data: "+b.get());
		//변환된 데이터 타입 출력
		System.out.println("b T type "+b.get().getClass().getName());
	}

}

package JavaVariable;

class Gene3<E>{
	public E element;
	
	public void set(E element) {
		this.element = element;
	}
	
	E get(){
		return element;
	}
	//여기서부터는 클래스 E타입 -> 제네릭 클래스 안에 있는 E타입과는 다른 독립적인 타입이다.
	static <E> E genericmethod1(E o ) {
		return o;
	}
	static <T> T genericmethod2(T o) {
		return o;
	}
	 
}
public class Java_Generic_PRAC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gene3<String> a = new Gene3<String>();
		Gene3<Integer> b = new Gene3<Integer>();
		a.set("String 타입");
		b.set(50);
		System.out.println("a.element: "+a.get());
		System.out.println("b.element: "+b.get());
		
		System.out.println("<E> return Type: "+Gene3.genericmethod1(3.0).getClass().getName());
		System.out.println("<E> return Type: "+Gene3.genericmethod2("static generic 2").getClass().getName());
		System.out.println("<T> return Type: "+Gene3.genericmethod1(100).getClass().getName());
		System.out.println("<T> return Type: "+Gene3.genericmethod2("LOVE").getClass().getName());
		
		
		
		
		
		
		
		
		
	}

}
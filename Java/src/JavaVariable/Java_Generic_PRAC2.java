package JavaVariable;

class Gene2<T,K>{
	public T first;
	public K second;
	
	public void set(T first,K second) {
		this.first = first;
		this.second = second;
	}
	
	public T getfirst() {
		return first;
	}
	
	public K getsecond() {
		return second;
	}


}

public class Java_Generic_PRAC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gene2<String,Integer> a = new Gene2<String,Integer>();
		Gene2<String,Integer> b = new Gene2<String,Integer>();
		Gene2<String,Integer> c = new Gene2<String,Integer>();
		a.set(" a는 ", 10);
		b.set(" b는 ", 20);
		c.set(" c는 ", 30);
		
		System.out.println(a.getfirst()+a.getsecond());
		System.out.println(b.getfirst()+b.getsecond());
		System.out.println(c.getfirst()+c.getsecond());
		System.out.println(" T type: "+a.getfirst().getClass().getName());
		System.out.println(" K type: "+a.getsecond().getClass().getName());
		System.out.println();
		System.out.println(" T type: "+b.getfirst().getClass().getName());
		System.out.println(" K type: "+b.getsecond().getClass().getName());
		System.out.println();
		System.out.println(" T type: "+c.getfirst().getClass().getName());
		System.out.println(" K type: "+c.getsecond().getClass().getName());
		
		
	}

}

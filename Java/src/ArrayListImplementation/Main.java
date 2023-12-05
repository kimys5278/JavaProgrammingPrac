package ArrayListImplementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList number = new ArrayList();
		number.addLast(10);
		number.addLast(20);
		number.addLast(30);
		number.addLast(40);
		number.add(1,15);
		number.addfirst(5);
		number.addfirst(1);
		number.add(3,12);
		
		System.out.println(number);
		
		System.out.println("reomve");
		
		System.out.println(number.remove(1));		
		System.out.println(number);
		System.out.println(number.removedFirst());
		System.out.println(number.removedLast());
		System.out.println(number);
		
		System.out.println("get");
		
		System.out.println(number.get(0));
		System.out.println(number.get(1));
		System.out.println(number.get(2));
		
		System.out.println("size");
		System.out.println(number.size());
		System.out.println("indexOf");		
		System.out.println(number.indexOf(15));
		System.out.println(number.indexOf(70));
		
		System.out.println();
		
		//반복
//		for( int i=0; i<number.size();i++) {
//			System.out.println(number.get(i));
//		}
		System.out.println("next");
		ArrayList.ListIterator li =number.listIterator();
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println();
		System.out.println("previous");
		//next 반대로 
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.hasprevious());
		
		while(li.hasprevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("add");
		while(li.hasNext()) {
			int numbers = (int)li.next();
			if(numbers ==15) {
				li.add(17);
//				li.remove(30);
			}
		}
		System.out.println(number);
	}
}

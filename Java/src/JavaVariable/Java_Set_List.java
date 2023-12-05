package JavaVariable;

import java.util.HashSet;
import java.util.Iterator;

public class Java_Set_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> a1 = new HashSet();
		//ArrayList<Integer> a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(2);
		a1.add(2);
		a1.add(2);
		a1.add(3);
		
		HashSet<Integer> a2 = new HashSet();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		
		HashSet<Integer> a3 = new HashSet();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		
		System.out.println(a1.containsAll(a2)); //false
		System.out.println(a1.containsAll(a3)); //true
		
		Iterator hi = (Iterator) a1.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		
	}

}

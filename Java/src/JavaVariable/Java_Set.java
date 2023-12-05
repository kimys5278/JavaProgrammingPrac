package JavaVariable;

import java.util.HashSet;
import java.util.Iterator;

public class Java_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet <Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet <Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);

		//A.containsAll(B) ->A에 B원소 전체가 들어가 있냐는 말.
		System.out.println(A.containsAll(B)); // false
		System.out.println(A.containsAll(C)); // true
		
		//A.addAll(B): 합집합 ->A의 집합에 B 원소 추가.
//		A.addAll(B);
		
		//A.retainAll(B): 교집합 -> A와B의 공통 원소.
//		A.retainAll(B);
		
		//A.removeAll(B): 차집합 -> A집합에서 B집합에 있는 원소 뺴기.
		A.removeAll(B);
		
		Iterator hi = (Iterator) A.iterator(); 
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}

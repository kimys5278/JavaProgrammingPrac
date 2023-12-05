package JavaVariable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterator -> 반복 
		Collection <Integer> A = new HashSet<Integer> ();
		//Collection <Integer> A = new ArrayList<Integer> ();
		
		A.add(1);
		A.add(2);
		A.add(3);
		
		Iterator hi =A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
			
		//Iterator 데이터타입인 hi 인스턴스 생성 
		//A.Iterator를 통하여 A의 원소를 hi에 넣음.
		//hi.hashNext는 A와 hi 값을 비교하여 동일하면 true
		//true가 되면 while문 실행
		//hi.next는 hi에 대한 원소들을 하나씩 리턴해주고, 사라짐.(hi에 대한 원소만 사라지고 오리지널 A의 원소는 사라지지 않음.)
		
			
		}
		
	}

}

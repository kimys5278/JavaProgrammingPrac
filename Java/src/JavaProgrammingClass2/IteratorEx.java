package JavaProgrammingClass2;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		Iterator<Integer> it = v.iterator();
		
		//모든 요소 출력
		while(it.hasNext()){
			int n = it.next();
			System.out.println(n);
		}
		
		int sum =0;
		it = v.iterator();
		//모든 요소 합
		while(it.hasNext()) {
			int n = it.next();
			sum+=n;
		}
		System.out.println(sum);

	}

}

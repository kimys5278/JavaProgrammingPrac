package Chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EX_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(new Integer (1));
		list1.add(new Integer (5));
		list1.add(new Integer (3));
		list1.add(new Integer (2));
		list1.add(new Integer (4));
		System.out.println("list1 : "+list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 3));
		//subList -> 1에서 3까지 반환. = [5, 3]
		System.out.println("list2 : "+list2);
		
		/*자바에서 Collections은 클래스
		이 클래스 안에 있는 메서드는 static 이기 때문에 인스턴스를 생성하지 않고 바로 사용이 가능.
		*/
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("list1 : "+list1+"\n"+"list2 : "+list2);
		
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("list2 : "+list2);
		list2.set(3,"x");
		System.out.println("list2 : "+list2);
		System.out.println("list1 retainAll(list2) : "+ list1.retainAll(list2));
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		
		for(int i =0;i<list2.size();i++) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		System.out.println("list2 : "+list2);
	}

}

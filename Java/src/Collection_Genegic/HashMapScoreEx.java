package Collection_Genegic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> s = new HashMap<String,Integer>();
		s.put("김", 98);
		s.put("박", 75);
		s.put("이", 81);
		s.put("최", 85);
		s.put("정", 97);
		
		System.out.println("요소 개수 : "+s.size());
		
		Set<String> keys = s.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = s.get(name);
			System.out.println(name+":"+score);
		}

	}

}

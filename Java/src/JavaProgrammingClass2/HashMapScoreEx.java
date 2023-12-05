package JavaProgrammingClass2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> score  = new HashMap<String,Integer>();
		score.put("김유성",100);
		score.put("박유성",80);
		score.put("이유성",75);
		score.put("정유성",88);
		score.put("신유성",76);
		
		System.out.println("HashMap 요소개수"+score.size());
		
		//모든 사람 점수 출력
		Set<String> keys = score.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int scores = score.get(name);
			System.out.println(name+" "+scores);
		}
	}

}

package Collection_Genegic;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a","b");
		map.put("c","d");
		map.put("e","f");
		
		String kor = map.get("a");
		System.out.println(kor);
		map.remove("e");
		int h = map.size();
		System.out.println(map+"길이"+h);
		
	}

}

package JumptoJava;

import java.util.HashMap;

public class Java맵연숩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("soccer", "축구");
		map.put("myname", "김유성");
		System.out.println(map);
		System.out.println(map.get("soccer"));
		//value값이 없으면 null이 나오지만
		//Default 값을 얻고싶으면 getOrDefualt를 한다.
		System.out.println(map.getOrDefault("java","자바"));
		
		//key가 있는지 확인하는 방법
		System.out.println(map.containsKey("people"));
		
		//remove key에 대한value를 삭제한뒤 리턴한다.
		System.out.println(map.remove("people"));
		
		//map의 갯수 리턴
		System.out.println(map.size());
		
		//모든 key를 모아서 리턴
		System.out.println(map.keySet());





		

	}

}

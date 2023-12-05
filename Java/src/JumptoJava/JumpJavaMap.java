package JumptoJava;

import java.util.HashMap;

public class JumpJavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map은 Dictionary와 비슷
		//key 로 value를 얻는다.
		
		//HashMap --> 제네릭스 이용한다 . key : value 모두 String 타입이용.
		HashMap <String,String> map = new HashMap<>();
		//put 메서드
		map.put("people","사람");
		map.put("soccer","축구");
		System.out.println(map);
		
		//get 메서드 key를 이용하여 value 출력
		System.out.println(map.get("people"));
		
		//getOrDefault -> key 에 해당하는 value가 없을때 get 메서드를 사용하여 null리턴
		//그러나 null대신 디폴트 값을 얻을 때는 getOrDefault 메서드 사용.
		System.out.println(map.get("java"));
		System.out.println(map.getOrDefault("java", "자바"));
		
		//containsKey
		//앱에 해당하는 키가 있으면 그 결과를 boolean으로 리턴
		System.out.println(map.containsKey("people"));
		
		//remove
		//맵의 항목을 삭제하는 메서드로 키값에 해당하는 아이템(key,value)를 삭제한후 value값을 출력
		System.out.println(map.remove("people"));
		
		//size
		// Map의 갯수 리턴
		System.out.println(map.size());
		
		//keySet
		HashMap<String,String> map1 = new HashMap();
		map1.put("이름","김유성");
		map1.put("나이","23");
		map1.put("직업","대학생");
		System.out.println(map1.keySet());
			
		/*LinkedHashMap과 TreeMap
		Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다. 
		하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 
		때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다. 
		이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다.

		LinkedHashMap은 입력된 순서대로 데이터를 저장하는 특징을 가지고 있다.
		TreeMap은 입력된 key의 오름차순 순서로 데이터를 저장하는 특징을 가지고 있다.
		*/

	}

}

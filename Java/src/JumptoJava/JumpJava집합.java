package JumptoJava;

import java.util.Arrays;
import java.util.HashSet;

public class JumpJava집합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//집합 - 중복허용x ,순서 x
		HashSet<String> set = new HashSet<>(Arrays.asList("H","e","L","L","O"));
		System.out.println(set);
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9,10));
		
		//교집합
		HashSet <Integer> intersection = new HashSet<>(s1);
		//retainAll 메서드로 쉽게 교집합 구할수 있음.
		intersection.retainAll(s2);
		System.out.println(intersection);
		
		//합집합
		HashSet <Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println(union);
		
		//차집합
		HashSet<Integer> substract = new HashSet(s1);
		substract.removeAll(s2);
		System.out.println(substract);
		
		//값 여러개 추가하기 (addAll)
		HashSet<String> set1 = new HashSet();
		set1.add("함수");
		set1.addAll(Arrays.asList("자바","파이썬","C언어"));
		System.out.println(set1);
		
		//특정 값 제거하기
		set1.remove("함수");
		System.out.println(set1);
		
		/*TreeSet과 LinkedHashSet
		Set 자료형은 순서가 없다는 특징이 있다. 
		하지만 가끔은 Set에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 
		때로는 오름차순으로 정렬된 데이터를 가져오고 싶을 수도 있을 것이다. 
		이런경우에는 TreeSet과 LinkedHashSet을 사용한다.
		
		TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
		LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.
		*/
		
		

	}

}

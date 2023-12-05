package JumptoJava;

import java.util.Arrays;
import java.util.HashSet;

public class Java집합연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//집합만들기
		//중복허용x,순서x
		 HashSet<String> set = new HashSet<>(Arrays.asList("H","E","L","L","O"));
		 System.out.println(set);
		 
		 //교집합만들기
		 HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		 HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
		 HashSet<Integer> intersection = new HashSet<>(s1);
		 intersection.retainAll(s2);
		 System.out.println(intersection);

		 //합집합만들기
		 HashSet<Integer> union = new HashSet<>(s1);
		 union.addAll(s2);
		 System.out.println(union);
		 
		 //차집합만들기
		 HashSet<Integer> substract = new HashSet<>(s1);
		 substract.removeAll(s2);
		 System.out.println(substract);
		 
		 //집합에 값 추가하기
		 HashSet<String> set1 = new HashSet<>();
		 set1.add("jump");
		 set1.add("to");
		 set1.add("java");
		 System.out.println(set1);
		 
		 //여러 값 추가하기
		 set1.addAll(Arrays.asList("hello","hi"));
		 System.out.println(set1);
		 
		 
		 
				 

	}

}

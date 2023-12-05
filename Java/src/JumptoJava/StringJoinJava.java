package JumptoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringJoinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String.join사용 X
		//리스트를 요소를 콤마로 구분하여 문자열로 만들기
		
		ArrayList<String> piches = new ArrayList<>(Arrays.asList("138","129","142"));
		String result = "";
		for(int i=0;i<piches.size();i++) {
			result += piches.get(i);
			result += ",";
		}
		result = result.substring(0,result.length()-1);
		System.out.println(result);
		
		
		//위 코드 Stirng.join사용
		ArrayList <String> pitches = new ArrayList<>(Arrays.asList("123","456","789"));
		String result1 = String.join(",", pitches);
		System.out.println(result1);
		
		//리스트 정렬하기
		ArrayList <String> num = new ArrayList<>(Arrays.asList("111","222","333"));
		num.sort(Comparator.naturalOrder()); // 오름차순 정렬
		System.out.println(num);
		num.sort(Comparator.reverseOrder()); // 내림차순 정렬
		System.out.println(num);
	}

}

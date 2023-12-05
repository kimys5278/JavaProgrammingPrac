package JumptoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JumpJava리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList pitches = new  ArrayList();
		pitches.add("123");
		pitches.add("129");
		pitches.add("142");
		//첫번째 자리에 133 추가
		pitches.add(0,"133");
		//두번째 자리에 155 추가
		pitches.add(1,"155");
		System.out.println(pitches);
		
		//두번쨰 숫자를 출력
		System.out.println(pitches.get(1));
		
		//ArrayList 갯수 출력
		System.out.println(pitches.size());
		
		//해당항목이 있는지 판별 결과를 boolean으로 출력
		System.out.println(pitches.contains("143"));
		
		//remove 두가지경우 
		// 첫번쨰 리스트에서 해당 항목 삭제하고 삭제한 결과 boolean으로 리턴
		System.out.println(pitches.remove("133"));
		
		//두번쨰 해당 인덱스 항목삭제하고 삭제한 항목 반환
		System.out.println(pitches.remove(0));
		
		
		//제네릭스
		//밑에 코드는 ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다.
		//제네릭스 사용안하면 형변환을 해야한다. 그러나 객체안에 다른 타입의 자료형이 들어올수 있으므로, 
		//오류 가능 so 제네릭스를 하면불필요한 코딩 감소
		ArrayList <String> pitche = new ArrayList<>();
		pitche.add("3");
		pitche.add("5");
		pitche.add("7");
		String one = pitche.get(0);
		String two = pitche.get(1);
		
		System.out.println(one);
		System.out.println(pitche);
		
		String[] data = {"123","456","789"};
		
		//Arrays 안에 asList 메서드를 활용하면 이미 존재하는 문자열 배열로 ArrayList생성가능
		ArrayList<String>pitches1 = new ArrayList<>(Arrays.asList(data));
		System.out.println(pitches1);
		
		
		//String 배열대신 String 자료형 여러개 전달하여 생성가능
		ArrayList<String>pitches2 = new ArrayList<>(Arrays.asList("123","321","159"));
		System.out.println(pitches2);
		
		
		//String.join 사용안하고 만들기
		ArrayList<String> num = new ArrayList<>(Arrays.asList("123","456","789"));
		String result = " ";
		for( int i =0; i<num.size(); i++) {
			result+=num.get(i);
			result += ",";	
		}
		result = result.substring(0,result.length()-1);
		System.out.println(result);
		
		//string.join 사용하기
		String[] num1 = new String[]{"111","222","333","444","555"};
		String result1 = String.join(",", num1);
		System.out.println(result1);
		
		
		
		ArrayList<String> number = new ArrayList<>(Arrays.asList("138","129","142"));
		number.sort(Comparator.naturalOrder());
		System.out.println(number);
		ArrayList<String> number2 = new ArrayList<>(Arrays.asList("111,5,4,67,7,8"));
		number2.sort(Comparator.reverseOrder());
		System.out.println(number2);
		String resul = String.join(",",number2);
		System.out.println(resul);
		
	}
	

}

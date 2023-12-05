package JavaVariable;

import java.util.ArrayList;

public class JavaArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList배열 사용
		ArrayList a1 = new ArrayList();
		a1.add("하나");
		a1.add("둘");
		a1.add("셋");
		a1.add("넷");
		a1.add("다섯");
		for(int i =0;i<a1.size();i++) {
			String value = (String)a1.get(i);
			System.out.println(value);
			}
		System.out.println();
		
		
		for(int i =0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println();
		
		ArrayList <String> a2 = new ArrayList<String>();
		a2.add("one");
		a2.add("two");
		a2.add("three");
		a2.add("four");
		a2.add("five");
		for(int j =0;j<a2.size();j++) {
			String value1 = a2.get(j);
			System.out.println(value1);
			}
		System.out.println();
		
		for(int i =0;i<a2.size();i++) {
			System.out.println(a2.get(i));
		}
	}

}

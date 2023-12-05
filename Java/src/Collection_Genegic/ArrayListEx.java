package Collection_Genegic;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("apple");
		a.add("grape");
		a.add("orange");
		a.add(null);
		a.add(2,"hello");
		String str = a.get(1);
		System.out.println(str);
		System.out.println(a);
		int len = a.size();
		System.out.println(len);
		a.remove(1);
		
		a.clear();
	}

}

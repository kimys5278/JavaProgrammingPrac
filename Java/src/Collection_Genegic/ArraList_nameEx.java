package Collection_Genegic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraList_nameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.println("이름을 입력하세요>>");
			String q = sc.next();
			name.add(q);
		}
		
		System.out.println(name);
	
		int longindex = 0;
		for(int i=1;i<name.size();i++) {
			if(name.get(longindex).length()<name.get(i).length()) {
				longindex = i;
			}

		}
		System.out.println("가장 이름이 긴 사람은 >>"+name.get(longindex));
		sc.close();		
		

	}

}

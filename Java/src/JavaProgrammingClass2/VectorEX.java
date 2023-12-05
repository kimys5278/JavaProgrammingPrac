package JavaProgrammingClass2;

import java.util.Vector;

public class VectorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(2);
		v.add(1);
		
		v.add(2,100);
		System.out.println(v);
		System.out.println("벡터 요소갯수: "+v.size());
		System.out.println("벡터 용량: "+v.capacity());
		
		//모든요소 출력하기
		for(int i =0;i<v.size();i++) {
			int n =v.get(i);
			System.out.println(n); 
		}
		
		int sum =0;
		//벡터 모든 요소 더하기
		for(int i =0;i<v.size();i++) {
			int n = v.elementAt(i);
			sum+=n;
		}
		System.out.println("벡터 요소의 합: "+sum);
		

	}

}

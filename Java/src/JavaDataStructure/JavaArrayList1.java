package JavaDataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 생성
		ArrayList<Integer> number = new ArrayList<>();
		//add -> 데이터 추가하기
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(1,50);
		System.out.println("add 값");
		System.out.println(number);
		
		//remove -> 데이터 삭제하기
		number.remove(2);
		System.out.println("remove 값");
		System.out.println(number);
		
		//Get -> 데이터 가져오기
		System.out.println("get 값");
		System.out.println(number.get(2));
		
		//Size -> 데이터크기 (데이터요수 개수)
		System.out.println("size 값");
		System.out.println(number.size());
		
		System.out.println();
		//Iteration ->순차적으로 하나씩 꺼내기
		Iterator <Integer>it = number.iterator();
		
		//hasNext() -> 가져올 수 있는 다임 데이터가 있는지 질문
		//next(); -> 다음껄 a의 변수에 넣음
		
		while(it.hasNext()) {
			int value = it.next();
			if(value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println();
		System.out.println(number);
		
		System.out.println();
		
		for( int a:number) {
			System.out.println(a);
		}
		System.out.println();
		
		//일반적인 for문
		for(int i =0; i<number.size();i++) {
			System.out.println(number.get(i));
		}
		
	}

}

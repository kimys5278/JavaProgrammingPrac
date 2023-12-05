package Collection_Genegic;
import java.util.Vector;

public class Collection_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//백터 생성
		Vector<Integer> v = new Vector<>();
		
		//요소 추가
		v.add(1);
		v.add(5);
		v.add(10);
		v.add(8);
		v.add(7);
		
		System.out.println(v); 
		//요소 개수
		int len = v.size();
		
		//요소 용량
		int capacitys = v.capacity();
		System.out.println("v의 요수갯수,길이 >>"+len+"\nv의 용량>>"+capacitys);
		
		//요소 중간삽입
		v.add(2,100);
		
		//요소얻어내기
		Integer obj = v.get(2);
		int i = obj.intValue();
		System.out.println(obj+","+i);
		
		//요소얻어내기-자동박싱
		int a = v.get(0);
		System.out.println(a);
		
		//마지막 요소 
		int last = v.lastElement();
		System.out.println("마지막 요소>>"+last);
		
		//모든 요소삭제
		v.removeAllElements();
		System.out.println(v);
		
	}

}

package JavaOOP;

import JavaOOP.Math;

class Math{
	//메서드 정의 -> 반환타입 메서드이름 지역변수 -> 실행
	//메서드 클래스 정의
	long add(long a, long b) {
		long result= a+b;
				return result;
				
	}
	long sub(long a, long b) {
		long result= a-b;
				return result;
				
	}
	//이렇게 간단히도 가능
	long mul(long a, long b) {return a*b;}
	
	long div(long a, long b) {return a/b;}
}

public class Java메서드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math mm = new Math();
		long result1 = mm.add(10,5);
		long result2 = mm.sub(10,5);
		long result3 = mm.mul(10,5);
		long result4 = mm.div(10,5);
		
		System.out.printf("더하기 값은 %d\n빼기 값은%d\n곱하기 값은%d\n나누기 값은%d\n",result1 , result2, result3 , result4);


			}	
			
		}


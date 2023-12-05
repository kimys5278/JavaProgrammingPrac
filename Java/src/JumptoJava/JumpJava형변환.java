package JumptoJava;

public class JumpJava형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "123";
		
		int n = Integer.parseInt(num);
		System.out.println(n);
		
		int a = 777;
		String number = ""+a;
		String num1 = String.valueOf(a);
		//null값일때 출력값으로 null 출력
		String num2 = Integer.toString(a);
		//null값일때 NullPointerException 오류 발생 
		
		System.out.println(number);
		System.out.println(num1);
		System.out.println(num2);
		
		//////////////////////////////////
		
		String N = "123.456";
		double d = Double.parseDouble(N);
		System.out.println(d);
		
		///////////////////////////////////
		
		int Num = 999;
		double d1 = Num;
		System.out.println(d1);
		
		double Num2 = 999.888;
		int n2 = (int)Num2;
		System.out.println(n2);
		
		//실수형을 문자형으로 바꾸면 NumberFormatException 오류 발생
	

	}

}

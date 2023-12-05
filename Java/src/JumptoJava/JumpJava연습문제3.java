package JumptoJava;

import java.util.ArrayList;
import java.util.Arrays;

public class JumpJava연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pin="000510-33333333";
		String yymmdd = pin.substring(0,6);
		String num = pin.substring(7);
		System.out.println(yymmdd);
		System.out.println(num);
		System.out.println(pin.charAt(7));
		
	}

}

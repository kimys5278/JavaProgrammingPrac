package JavaVariable;

import java.util.ArrayList;

public class JavaArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반 배열 사용
		//[2] 이상하면 오류가 생김
		String [] arrObj = new String[2];
		arrObj[0] = "하나";
		arrObj[1] = "둘";
		for(int i =0;i<arrObj.length;i++) {
			System.out.println(arrObj[i]);
		}
		

		
	}
	
}

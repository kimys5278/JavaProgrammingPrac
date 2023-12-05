package JavaDataStructure;

public class Java배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 생성
		int []number1 = new int [4];
		number1[0] = 1;
		number1[1] = 2;
		number1[2] = 3;
		number1[3] = 4;
		
		int []number2 = {10,20,30,40};
		int []number3 = new int[] {100,200,300,400};

		
		//배열 요소 가져오기
		System.out.println(number1[0]);
		System.out.println();
		
		//Size - 요소개수
		System.out.println(number1.length);
		System.out.println();
		
		//Iteratiom -> 반복
		int i =0;
		while(number1.length>i) {
			System.out.println(number1[i]);
					i++;
		}
		System.out.println();
		
		for(int j =0;j<number1.length;j++) {
			System.out.println(number1[j]);
		}

	}

}

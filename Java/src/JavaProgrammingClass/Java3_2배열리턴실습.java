package JavaProgrammingClass;

public class Java3_2배열리턴실습 {
	static int [] makearr() {
		int temp[] = new int [4];
		for(int i =0; i <temp.length;i++) {
			temp[i] = i; //배열의 원소 0~3으로 초기화.
		}
		return temp; //배열리턴
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]; //배열 레퍼런스 변수 선언.
		arr = makearr(); //메서드로 부터 배열 전달받음.
		for( int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" "); // 배열 모든 원소 출력.
			
		}
	}

}

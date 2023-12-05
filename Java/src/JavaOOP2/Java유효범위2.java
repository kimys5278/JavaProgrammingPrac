package JavaOOP2;

public class Java유효범위2 {
	static int i ;  //전역변수
	static void a() {
		i = 0; // 지역변수
		//i=0;만하면 무한루프생김 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (i =0;i<5;i++) {
			a();
			System.out.println(i);
		}

	}

}

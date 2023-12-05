package JavaOOP2;


public class Java유효범위 {
	
	static void a() {
		int i = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
			
			
		}
	}

}

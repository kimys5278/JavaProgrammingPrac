package JavaVariable;

public class Java상수_enum1 {
	// 변하는 값  - 변수
	// 변하지 않는 값 - 상수
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+" kcal");
		
		case PEACH:
			System.out.println(34+" kcal");
		
		case BANANA:
			System.out.println(93+" kcal");
			break;
		}
	}
}


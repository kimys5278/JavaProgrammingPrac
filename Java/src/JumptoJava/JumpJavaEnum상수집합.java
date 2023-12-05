package JumptoJava;

public class JumpJavaEnum상수집합 {
	
	enum CoffeeType{
		AMERICANO,
		ICE_AMERICANO,
		CAFE_LATTE
	};
	
	enum sports{
		soccer,
		baseball,
		tennis;
		
	}
	
	public static void main(String[] args) {	
	System.out.println(CoffeeType.AMERICANO);
	System.out.println(CoffeeType.ICE_AMERICANO);
	System.out.println(CoffeeType.CAFE_LATTE);
	
	for(sports type:sports.values()) {
		System.out.println(type);
		
		}
		
		
	}
}

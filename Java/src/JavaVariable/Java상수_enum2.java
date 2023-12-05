package JavaVariable;


//class Fruit1{
//	public static final Fruit1 APPLE = new Fruit1();
//	public static final Fruit1 PEACH = new Fruit1();
//	public static final Fruit1 BANANA = new Fruit1();
//
//}
//class Company{
//	public static final Company GOOGLE = new Company();
//	public static final Company APPLE = new Company();
//	public static final Company ORACLE = new Company();
//}
interface FRUIT1{
	int APPLE = 1, PEACH =2, BANANA=3;
}
interface COMPANY{
	int GOOLE = 1, APPLE =2, ORACLE=3;
}


public class Java상수_enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(Fruit1.APPLE == Company.APPLE) {
//		System.out.println("과일과 기업의 애플은 같습니다.");
//	}
//      과일과 기업의 애플은 이름은 같지만, 비교대상이 아니다.       
//      데이터 타입을 다르게하면 비교할 수 없다.
		
//		Fruit1 type = Fruit1.APPLE;
//		
//		switch(type) {
//			case Fruit1.APPLE:
//				System.out.println(57+" kcal");
//			case Fruit1.PEACH :
//				System.out.println(34+" kcal");
//			case Fruit1.BANANA :
//				System.out.println(93+" kcal");
//		}
		//switch문은 데이터타입이 제한적이기때문에 우리가 
		//생성한 상수들에서는 오류가 나온다.
		//enum3에서 그 해결방안을 했다.

	}

}

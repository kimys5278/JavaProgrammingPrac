package JavaOOP2;

class Food {
	  // 필드
	  String name;
	  int price;
	  public Food(String str, int i) {
	    name = str;
	    price = i;
	  }
	  public String toString() {
	    return String.format("Food { name: %s, price: %d원 }", name, price);
	  }
	}
public class Java음식클래스연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 음식 객체 생성
	    Food chicken = new Food("치킨", 18000);
	    Food pizza = new Food("피자", 28000);
	    Food sushi = new Food("초밥세트", 22000);
	    // 객체 배열에 음식 담기
	    Food[] foods = { chicken, pizza, sushi };
	    // 모든 음식 정보 출력
	    for (int i = 0; i < foods.length; i++) {
	      System.out.println(foods[i].toString());
	    }
	  }
	}



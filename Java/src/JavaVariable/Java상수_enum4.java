package JavaVariable;

enum Fruit3{
	APPLE("red"),PEACH("pink"),BANANA("yellow");
	private String color;
	
	public String getcolor() {
		return this.color;
	}
	//메서드 안써도 됨. 그냥 연습해본거.
	
	Fruit3(String color){
		this.color = color;
	}
}
enum Company2{
	GOOGLE,APPLE,ORACLE;
}

public class Java상수_enum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Fruit3 type = Fruit3.APPLE;
		switch(type) {
		case APPLE:
			System.out.println(57+" kcal color: "+Fruit3.APPLE.getcolor());
		case PEACH:
			System.out.println(34+" kcal color "+Fruit3.PEACH.getcolor());
		case BANANA:
			System.out.println(93+" kcal color :"+Fruit3.BANANA.getcolor());
		}
*/	
	for(Fruit3 f : Fruit3.values()) {
		System.out.println(f);
	}
		
	}

}

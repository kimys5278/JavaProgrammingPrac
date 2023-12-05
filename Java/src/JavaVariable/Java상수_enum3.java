package JavaVariable;

enum Fruit2{
	APPLE,PEACH,BANANA;
}
enum Company1{
	GOOGLE,APPLE,ORACLE;
}

public class Java상수_enum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit2 type = Fruit2.APPLE;
		//약속된 문법.
	
		switch(type) {
			case APPLE:
				System.out.println(57+" kca456l");
			case PEACH:
				System.out.println(34+" kcal");
			case BANANA:
				System.out.println(93+" kcal");
		}		

	}

}

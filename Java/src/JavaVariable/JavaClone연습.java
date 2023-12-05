package JavaVariable;

class H {
	protected String test () {
	return "test";
	}
}

class Fruit extends H implements Cloneable{
	String name ;
	Fruit(String name){
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	} 

	
	
}

public class JavaClone연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f1 = new  Fruit("apple");
		System.out.println(f1.test());
		try {
			Fruit f2 = (Fruit)f1.clone();
			System.out.println(f1.name);
			System.out.println(f2.name);
			
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

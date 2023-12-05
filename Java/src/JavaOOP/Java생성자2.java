package JavaOOP;

class cafe {
	
	String menu;
	String name;
	int price;
	
	cafe(){
		this("americano","tosome",3500);
	}
	
	cafe(String menu , String name, int price){
		this.menu = menu;
		this.name = name;
		this.price = price;	
	}
	
}


public class Java생성자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		cafe c1 = new cafe ();
   
		
		cafe c2 = new cafe ("choco latte","starbucks",3500);
		
		System.out.println(c1.name +"의 "+ c1.menu +" 가격은 "+ c1.price +" 입니다.");
		System.out.println(c2.name +"의 "+ c2.menu +" 가격은 "+ c2.price +" 입니다.");
	}

}

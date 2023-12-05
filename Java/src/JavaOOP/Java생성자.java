package JavaOOP;

class phone {
	String name;
	String company;
	String contry;
	int price;
	int sellnum;
	
	phone (){}
	
	phone(String n, String co , String c, int p ,int s){
		name = n;
		company = co;
		contry = c;
		price = p;
		sellnum = s;
	}
}

public class Java생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	phone p1 = new phone();
	p1.name = "Galuxy";
	p1.company = "Samsung";
	p1.contry = "Korea";
    p1.price = 1250000;
    p1.sellnum = 90000000;
			
    phone p2 = new phone("iphone","apple","USA",1450000,95000000);
    
    System.out.println(p1.company+" 의 "+p1.name+" 의 "+" 가갹과 팔린 수는 각각"+ p1.price+"원 "+p1.sellnum+"대 이다.");
    System.out.println(p2.company+" 의 "+p2.name+" 의 "+" 가갹과 팔린 수는 각각"+ p2.price+"원 "+p2.sellnum+"대 이다.");
		
 	
  }
}

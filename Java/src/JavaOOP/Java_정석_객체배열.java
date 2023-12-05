package JavaOOP;

class DigitalStore{
	int price;
	int bonuspoint;
	
	public DigitalStore(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	
	DigitalStore(){}
	
}

class Computers extends DigitalStore{
	
	Computers() { super(100); }
	
	public String toString() {
		return "TV";
	}
	
}

class Playstation extends DigitalStore{
	
	public Playstation() {super(200);}

	public String toString() {
		return "Playstation";
	}

}

class Mp3 extends DigitalStore{
	Mp3(){super(50);}

	public String toString() {
		return "Mp3";
	}
}

class User {
	int money =10000;
	int bonuspoint = 0;
	DigitalStore[] ds = new DigitalStore[10];
	
	int i = 0;
	
	void buy(DigitalStore p) {
		if(money<p.price) {
		System.out.println("잔액 부족");
			}else {
				return;
			}
			money -= p.price;
			bonuspoint +=p.bonuspoint;
			ds[i++] = p;
			System.out.println(p+"를 구입 하셨습니다.");
		}
	
	void summary() {
		int sum=0;
		String item= "";
		
		for(int i=0;i<ds.length;i++) {
			if(ds[i] != null) {
			sum+=ds[i].price;
			item += ds[i]+" , ";	
			}else {break;}

		}
		System.out.println("구매하신 물품의 총금액은"+sum+"입니다.");
		System.out.println("구매하신 제품은"+item+"입니다.");
		
	}
	
}



public class Java_정석_객체배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		u.buy(new Computers());
		u.buy(new Playstation());
		u.buy(new Mp3());
		u.summary();
			
	}

}

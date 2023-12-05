package JavaOOP2;

class coin1 {
	String name;
	String name2;
	int coins=1;
	int coins2=1;
	
	public void set(String name,String name2) {
		this.name = name;
		this.name2 = name2;
	}
	
	public void malon() {
		System.out.printf("name: %s, coins: %d\n",name,coins);
		coins ++;
	}
	
	public void gloria() {
		System.out.printf("name: %s, coins2: %d\n",name2,coins2);
		coins2 ++;
	}
	
	
}

public class Java코인채굴하기문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coin1 c = new coin1();
		c.set("말런","글로리아");
		c.malon();
		c.malon();
		c.malon();
		c.gloria();
		c.gloria();
		
	}

}

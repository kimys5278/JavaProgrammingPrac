package JavaOOP2;


class coin {
	String name;
	int coins;
	public coin(String str) {
		name =str;
		coins = 0;
	}
	public String tostring() {
		return String.format("Miner {name:%s, coins:%d}",name,coins);
		
	}
	public void mine() {
		coins++;
	}
}
public class Java코인채굴하기문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coin malon = new coin("말런");
		coin gloria = new coin("글로리아");
		
		malon.mine();
		malon.mine();
		malon.mine();
		malon.mine();
		malon.mine();
		gloria.mine();
		gloria.mine();
		gloria.mine();
		System.out.println(malon.tostring());
		System.out.println(gloria.tostring());
		
		
	
	}

}

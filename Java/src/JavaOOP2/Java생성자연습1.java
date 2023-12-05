package JavaOOP2;

class Marine{
	String name;
	int hp;
	
	//생성자
	public Marine(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void steampack() {
		hp-=10;
		System.out.printf("[%s]의 SteamPack발동 -> %d",name,hp);
	}
}

class medic{
	String name;
	int hp;
	
	public medic(String name,int hp) {
		this.name=name;
		this.hp=hp;
	}
	
	public void heal() {
		hp+=10;
		System.out.printf("[%s]의 heal발동 -> %d",name,hp);
	
	}
	
}


public class Java생성자연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine m = new Marine("마린",100);
		m.steampack();
		medic mm = new medic("메딕",60);
		mm.heal();

	}

}

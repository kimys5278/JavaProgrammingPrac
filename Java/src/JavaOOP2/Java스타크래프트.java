package JavaOOP2;

class Marine1{
	int hp;
	int gun;
	public Marine1 ( int hp1, int gunattck) {
		this.hp = hp1;
		this.gun = gunattck;
	}
	
	public void steampack() {
		hp--;
		System.out.printf("Marine이 스팀팩을 사용하였습니다. 남은 체력: %d\n",hp);
	}
	
	public void developgun(){
		gun++;
		System.out.printf("Marine의 공격력이 업글레이드되었습니다. 공격력: %d\n",gun);
	}
	
	
}

class medic1{
	int hp2 ;
	
	public medic1 ( int hp3) {
		hp2 = hp3;
	}
	
	public void heal() {
		hp2++;
		System.out.printf("medic이 힐을 사용하였습니다. 남은 체력 %d\n",hp2);
	}
}


public class Java스타크래프트 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine1 m = new Marine1(60,50);
		m.steampack();
		m.steampack();
		m.steampack();
		m.developgun();
		m.developgun();
		m.developgun();
		
		medic1 md = new medic1(70);
		md.heal();
		md.heal();
		md.heal();
		md.heal();
		
	}
}

package JavaOOP;

class Units{
	public void attack() {
		System.out.println("유닛 공격");
	}
	public void defence() {
		System.out.println("유닛 방어");
	}
}

class Zealots extends Units{
	public void attack() {
		System.out.println("찌르기");
	}
	public void teleport() {
		System.out.println("순간 이동");
	}
}



public class Java_다운캐스팅1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Units unit_up ;
		Zealots z = new Zealots();
		
		unit_up = z; // 업캐스팅
		
		Zealots unit_down = (Zealots) unit_up;
		
		((Zealots)unit_up).teleport();
		
		unit_down.attack();
		unit_down.defence();
		unit_down.teleport();
		
		

	}

}

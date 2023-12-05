package JavaOOP;

class Unit{
	public void attack() {
		System.out.println("유닛 공격");
	}
}

class zealot extends Unit{
	public void attack() {
		System.out.println("찌르기");
	}
	
	public void teleport() {
		System.out.println("순간 이동");
	}
}





public class Java_참조형캐스팅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit u = new Unit();
		zealot z = new zealot();
		
		//업캐스팅
		u = z;
		u = (Unit)z;
		//업캐스팅 멤버 제한-> 부모타입이므로, 부모클래스에 멤버로 제한되었기때문에
		//자식클레스는 메서드 호출이되지 않는다.
		
		//Unit u_up = teleport(); -> error
		
		//그런데 자식클래스가 부모클래스의 메서드를 오버라이딩을 한경우에는 메서드 호출가능.
		Unit u_atack  = z;
		
		u_atack.attack();
		
	}

}

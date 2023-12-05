package JavaOOP;

class Starunit{
	public void attack() {
		System.out.println("유닛 공격");
	}
}

class zealott extends Starunit{
	public void attack() {
		System.out.println("찌르기");
	}
	public void teleport() {
		System.out.println("순간 이동");
	}
	
}

class marin extends Starunit{
	public void attack() {
		System.out.println("총 쏘기");
	}
	public void steampack() {
		System.out.println("스팀 팩");
	}
}

public class Java_다운캐스팅2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//업캐스팅 유무 확인 instanceOf
		
		zealott z = new zealott();
		
		if(z instanceof Starunit) {
			System.out.println("업캐스팅 가능");
			Starunit u =z;
		}else {
			System.out.println("불가능");
		}
		
		//다운 캐스팅 유무확인
		Starunit st = new Starunit();
		Starunit st2 = z;
		
		if(st instanceof zealott) {
			System.out.println("다운캐스팅 가능");
		}else {
			System.out.println("불가능");
		}
		
		if(st2 instanceof zealott) {
			System.out.println("다운캐스팅 가능");
			z = (zealott)st2;
		}else {
			System.out.println("불가능");
		}
		

	}

}

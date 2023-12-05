package JavaOOP;

abstract class Unitss{
	int x,y;
	abstract void move(int x,int y);
	void stop() {}
	
}

class Marine extends Unitss{
	void move(int x , int y) {
		System.out.println("("+x+","+y+")");
	}
	void steampack() {}
	
	void stop(){}
	
}
class Tank extends Unitss{
	void move(int x , int y) {
		System.out.println("("+x+","+y+")");
	}
	void stop(){}
}
class DropShip extends Unitss{
	void move(int x , int y) {
		System.out.println("("+x+","+y+")");
	}
	void stop(){}
}

public class Java_추상메서드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Unit [] group ={new Marine(),new Tank(),new Dropship()}
		Unitss [] group = new Unitss[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip();
		
		for(int i=0;i<group.length;i++) {
			group[i].move(100,200);
		}
		
		//group[0].move(100,200)
		//group[1].move(100,200)
		//group[2].move(100,200)
		//각 그룹들의 타입은 유닛임.
		
		
		
		
	}

}

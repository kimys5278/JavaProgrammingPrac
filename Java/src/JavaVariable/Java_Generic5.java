package JavaVariable;

abstract class Info{
	public abstract int getLevel();
}

class Empl2 extends Info{
	public int rank;
	Empl2(int rank){
		this.rank=rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class pers2<T extends Info>{
	public T info;
	pers2(T info){
		this.info = info;
		}
}
public class Java_Generic5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pers2 p1 = new pers2<Empl2>(new Empl2(1));	
	}

}

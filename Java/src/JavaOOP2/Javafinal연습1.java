package JavaOOP2;

class numclass{
	static final int num = 30;
	static int aa = 10;
	int a = 5;
	
	public void check(){
		System.out.println(aa);
		System.out.println(num);
		
	}
	static void cc() {
		System.out.println(aa);
	}
	
	
}

class numprac extends numclass{
	
	public void check1 () {
		System.out.println(a);
		System.out.println(aa);
		
	}
}

public class Javafinal연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numprac n = new numprac();
		n.check();
		numclass.cc();
		


	}

}

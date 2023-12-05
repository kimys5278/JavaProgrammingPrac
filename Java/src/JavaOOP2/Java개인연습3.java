package JavaOOP2;

class gugudan {
	public void re(){
		for( int i =0 ; i<10 ;i++ ) {
			for(int j=1; j<10;j++) {
				System.out.println(i+"*"+i+"="+i*j);
			}
		}
	}
}
class gugudan1 extends gugudan{
	public void re () {
		for( int i =0 ; i<10 ;i++ ) {
			for(int j=1; j<10;j++) {
				for(int z=0; z<10;z++) {
				System.out.println(i+"*"+i+"*"+z+"="+i*j*z);
				}
			}
		}
	}
}

class star {
	String a;
	public void star1(String a) {
		for (int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
			System.out.printf(a);
			}
			System.out.println(a);
		}
	}
}

class star2 extends star{
	String b;
	public void star1(String a , String b) {
		for (int i=0;i<5;i++) {
			for(int j=i;j<4;j++) {
			System.out.printf(a);
			}
			System.out.println(a);
		}
		
	}
	
}

public class Java개인연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gugudan1 g = new gugudan1();
		g.re();
		
//		star s = new star();
//		s.star1("*");
		
		star2 st = new star2();
		st.star1("*"," ");
		
	}
}	



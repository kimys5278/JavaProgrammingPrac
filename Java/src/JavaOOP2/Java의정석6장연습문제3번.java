package JavaOOP2;

class students{
	String name;
	int ban,no,eng,math,kor;
	public int total() {
		return kor+eng+math;
		
	}
	public float avg() {
		return Math.round((total())/3f*100)/100f;
	}
	
}


public class Java의정석6장연습문제3번 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students s = new students();
		s.name="홍길동";
		s.ban=1;
		s.kor=100;
		s.eng=60;
		s.math=76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.total());
		System.out.println("평균:"+s.avg());
		
	}

}

package JavaOOP2;

class ap{
	
	public String y() {
		return "public void y ()";
	}
	
	private String z() {
		return "public void z()";
	//private는 내부적으로는 사용 가능하나 외부적으로는 사용할 수 없다.
	}
	
	public String x() {
		return z();
	}
	
}

public class Java접근제어자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ap a = new ap();
		System.out.println(a.y());
		//System.out.println(a.z());
		//오류남
		System.out.println(a.x());

	}

}
package JavaOOP;

class data1{
	int x;
}

public class Java참초형매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data1 d = new data1 ();
		d.x = 100;
		System.out.println(d.x);
		change(d);
		System.out.println(d.x);
		

	}
	static void change (data1 d) {
		d.x = 300;
		System.out.println("change = "+ d.x);
		
	}

}
//값이 바뀌면서 주소도 바뀌기 때문에 값이 바뀐 그대로 유지된다.

package JavaOOP;

class math2{
	
	long add(long a, long b) {
		System.out.print("long a + long b -");
		return a+b;
	}
	int add(int a, int b) {
		System.out.print("int a + int b -");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("int a + long b -");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long a + int b -");
		return a+b;
	}
	int add(int[] a) {
		System.out.print("int add []a - ");
		int result = 0;
		for(int i=0; i<a.length;i++)
			result +=a[i];
		
		return result;
		
	}
}

public class Java오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math2 mm = new math2();
		System.out.println("mm.add(3L,3L)결과 :"+mm.add(3L, 3L));
		System.out.println("mm.add(3,3)결과 :"+mm.add(3, 3));
		System.out.println("mm.add(3L,3L)결과 :"+mm.add(3, 3L));
		System.out.println("mm.add(3L,3L)결과 :"+mm.add(3L, 3));
		int []a = {100,200,300};
		System.out.println("mm.add()결과 :"+ mm.add(a));
		
		
	}

}

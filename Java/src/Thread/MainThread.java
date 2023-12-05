package Thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA th1 = new ThreadA();
		Thread th2 = new Thread(new ThreadB());
		th2.start();
		th1.start();
		for(int i =0;i<1000;i++) {
			System.out.println("main:"+i);
		}
	}

}

package Thread;

class ShareBoard{
	private int sum =0;
	synchronized public void add() {
		int n =sum;
		Thread.yield();
		n+=10;
		sum = n;
		System.out.println(Thread.currentThread().getName()+":"+sum);
	}
	public int getSum() {return sum;}
}
class StudentThread extends Thread{
	private ShareBoard board;
	public StudentThread(String name, ShareBoard board) {
		super(name);
		this.board = board;
	}
	@Override
	public void run() {
		for(int i =0;i<100; i++) {
			board.add();
		}
	}
}

public class ShareBoardEx {

	public static void main(String[] args) {
		ShareBoard board = new ShareBoard();
		Thread th1 = new StudentThread("kitae",board);
		Thread th2 = new StudentThread("hyosoo",board);
		Thread th3 = new StudentThread("jungwoo",board);
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}

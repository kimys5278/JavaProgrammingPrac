package ThreadPrac;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timerlabel;
	
	public TimerRunnable(JLabel timerlabel) {
		this.timerlabel = timerlabel;
	}
	
	@Override
	public void run() {
		int n =0;
		while(true) {
			timerlabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}



public class ThreadTimerRunnableEx  extends JFrame{
	public ThreadTimerRunnableEx() {
		setTitle("Runnable을 이용한 스레드 타이머");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerlabel = new JLabel();
		timerlabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		TimerRunnable runnable = new TimerRunnable(timerlabel);
		Thread th = new Thread(runnable);

		c.add(timerlabel);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerRunnableEx();
		
	}

}

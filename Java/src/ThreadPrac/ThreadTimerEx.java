package ThreadPrac;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Thread.TimerThreadEx;

class Timer extends Thread{
	private JLabel label ;
	
	public Timer(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void run() {
	int n =0;
		
	while(true) {
		label.setText(Integer.toString(n));
		n++;
	
	try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			return;
			}
		}
		
	}
	
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("스레드 타이머");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(label);
		
		Timer t = new Timer(label);
		
		setSize(300,170);
		setVisible(true);
		
		t.start();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();

	}

}

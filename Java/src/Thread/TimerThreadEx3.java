package Thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread3 extends Thread{
	private JLabel timerlabel;
	
	public TimerThread3(JLabel timerlabel) {
		this.timerlabel = timerlabel;
	}
	
	@Override
	public void run() {
		int n =0;
		while(true) {
			timerlabel.setText(Integer.toString(n));
			n++;
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class TimerThreadEx3 extends JFrame{
	public TimerThreadEx3() {
	setTitle("Runnable을 이용한 타이머");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	//타이머 출력할 레이블 생성
	JLabel timerlabel = new JLabel();
	timerlabel.setFont(new Font("Gothic",Font.ITALIC,80));
	c.add(timerlabel);
	
	//타이머 스레드로 사용할 Runnable 객체 생성. 타이머 겂을 출력할 레이블을 생성자에 전달
	Thread th3 = new Thread(new TimerThread3(timerlabel));
	
	setSize(300,170);
	setVisible(true);
	
	th3.start();
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerThreadEx3();
	}

}

package Thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThreads2 extends Thread{
	private JLabel timerLabel; // 타이머 값이 출력되는 레이블
	public TimerThreads2(JLabel timeLabel) {
		this.timerLabel = timeLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
	
}

public class TimerThreadEx2 extends JFrame{
	public TimerThreadEx2() {
	setTitle("스레드를 상속받는 타이머예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	//타이머값을 출력할 레이블 생성 
	JLabel timerLabel = new JLabel();
	timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
	c.add(timerLabel);	
	
	//타이머 스레드 객체 생성. 타이머 값을 출력할 레이블을 생성자에 전달
	TimerThreads2 th2 = new TimerThreads2(timerLabel); 
	
	setSize(300,170);
	setVisible(true);
	
	th2.start();
}
	public static void main(String[] args) {
		new TimerThreadEx2();
	}

}

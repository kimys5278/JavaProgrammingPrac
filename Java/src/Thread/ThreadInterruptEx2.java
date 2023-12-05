package Thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadRunnable2 implements Runnable{
	private JLabel timerLabel;
	public ThreadRunnable2 (JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				return;
				}	
			}
		}
	}


public class ThreadInterruptEx2 extends JFrame{
	private Thread th;
	public ThreadInterruptEx2 () {
	setTitle("ThreadInterruptEx2 예제");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	//타이머 값을 출력할 레이블
	JLabel timerLabel = new JLabel ();
	timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
	
	//타이머 스레드로 사용할 Runnable 객체 생성
	//타이머 값을 출력할 레이블 컴포넌트 생성자에 전달
	

	TimerRunnable runnable = new TimerRunnable(timerLabel);
	th = new Thread(runnable);
	c.add(timerLabel);
	
	//버튼을 생성하고 Action 리스너 등록
	JButton btn = new JButton("Kill Timer");
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			th.interrupt();
			JButton btn = (JButton)e.getSource();
			btn.setEnabled(false);
		}
	});
	c.add(btn);
	
	setSize(300,170);
	setVisible(true);
	
	th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadInterruptEx2();
	}

}

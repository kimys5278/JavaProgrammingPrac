package Thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel2 extends JLabel implements Runnable{
	private int delay;
	public FlickeringLabel2 (String text, int delay) {
		super(text);
		this.delay = delay;
		
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		
		while(true) {
			if(n==0) {
				setBackground(Color.red);
			}else {
				setBackground(Color.blue);
			}
			
			if(n==0) {
				n=1;
			}else {
				n=0;
			}
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				return;
				}
			}
		}
	}

public class FlickeringLabelEx2 extends JFrame{
	public FlickeringLabelEx2() {
		setTitle("FlickeringLabelEx2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel2 fk1 = new FlickeringLabel2("깜빡",100);
		
		JLabel jl = new JLabel("안깜빡");
		
		FlickeringLabel2 fk2 = new FlickeringLabel2("깜빡",100);
		
		c.add(fk1);
		c.add(jl);
		c.add(fk2);
		
		setSize(300,150);
		setVisible(true);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlickeringLabelEx2();
	}

}

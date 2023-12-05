package Thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomThread extends Thread{
	private Container contentpane;
	private boolean flag = false;
	
	public RandomThread(Container contentpane) {
		this.contentpane = contentpane;
	}
	
	public void finish() {
		flag = true;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = ((int)Math.random()*contentpane.getWidth());
			int y = ((int)Math.random()*contentpane.getHeight());
			JLabel label = new JLabel("java");
			label.setSize(80,30); //레이블 크기
			label.setLocation(x,y); //레이블을 컨텐트팬 내의 임의의 위치로 설정
			contentpane.add(label); //레이블을 컨텐트팬에 추가
			contentpane.repaint(); //컨텐트팬을 다시 그려 추가된 레이블이 보이게 함
			try {
				Thread.sleep(300);
				if(flag == true) {
					contentpane.removeAll();
					label = new JLabel("finish");
					label.setSize(80,30);
					label.setLocation(100,100);
					
					label.setForeground(Color.red);
					contentpane.add(label);
					contentpane.repaint();
					return;
				}
			}catch(InterruptedException e) {
				return;
				
				}
		 	}	
		}
	}
	
	
	
	



public class ThreadFinishFlagEx extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx에제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
			th.finish();
			} 
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadFinishFlagEx();
	}

}

package JSwings;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Java_Swing.InnerClassListener;

public class InnerClassListenerEx2 extends JFrame {
	public InnerClassListenerEx2() {
		setTitle("내부클래스 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new MyMouseListener());
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		
		
	
	}
	
	private class MyMouseListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			if(b.getText().equals("action"))
				b.setText("액션");
			else
				b.setText("action");
			
			InnerClassListenerEx2.this.setTitle(b.getText());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();

	}

}

package JSwings;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel[] message;
	public KeyListenerEx() {
		setTitle("키보드리스너 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		message = new JLabel[3];
		message[0] = new JLabel("getKeyCode()");
		message[1] = new JLabel("getKeyChar()");
		message[2] = new JLabel("getKeyText()");
		
		for(int i =0;i<message.length;i++) {
			c.add(message[i]);
			message[i].setOpaque(true);
			message[i].setBackground(Color.yellow);
		}
		
		setSize(300,170);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}	
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode =e.getKeyCode();
			char keyChar = e.getKeyChar();
			message[0].setText(Integer.toString(keyCode));
			message[1].setText(Character.toString(keyChar));
			message[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("keypressed");
		
			
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("keyTyped");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyListenerEx();
	}

}


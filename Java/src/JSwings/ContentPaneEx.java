package JSwings;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.yellow);
		cp.setLayout(new FlowLayout());
		
		cp.add(new JButton("OK"));
		cp.add(new JButton("Cancle"));
		cp.add(new JButton("Ignore"));
		
		setSize(300,170);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ContentPaneEx();
	
	}
	

}

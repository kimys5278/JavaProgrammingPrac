package JSwings;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentEx extends JFrame {
	public ContentEx() {
		setTitle("ContentEx와 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("lgnore"));
		
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentEx();

	}

}

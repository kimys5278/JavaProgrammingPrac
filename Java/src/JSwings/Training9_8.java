package JSwings;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Fpanel extends JPanel{
	public Fpanel() {
		setBackground(Color.gray);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
		
	}
}
class Spanel extends JPanel{
	public Spanel() {
		setLayout(null);
		for(int i =0;i<25;i++) {
			JLabel label = new JLabel("*");
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			label.setForeground(Color.BLACK);
			label.setLocation(x,y);
			label.setSize(20,20);
			label.setOpaque(true);
			add(label);
		}
	}
	
}
class Tpanel extends JPanel{
	public Tpanel() {
		setBackground(Color.magenta);
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
	
}

public class Training9_8 extends JFrame{
	public Training9_8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(300,300);
		Fpanel fp = new Fpanel();
		Spanel sp = new  Spanel();
		Tpanel tp = new  Tpanel();
		add(fp,BorderLayout.NORTH);
		add(tp,BorderLayout.SOUTH);
		add(sp);
		setVisible(true);
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Training9_8();
	}

}

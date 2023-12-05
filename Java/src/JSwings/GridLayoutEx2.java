package JSwings;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GridLayoutEx2 extends JFrame{
	public GridLayoutEx2() {
	
		setTitle("GridLayoutEx2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		GridLayout grid = new GridLayout(4,3);
		
		grid.setVgap(5);
		cp.setLayout(grid);
		cp.setBackground(Color.yellow);
		
		cp.add(new JLabel(" 이름"));
		cp.add(new TextField(""));
		cp.add(new JButton("확인"));
		cp.add(new JLabel(" 학번"));
		cp.add(new TextField(""));
		cp.add(new JButton("확인"));
		cp.add(new JLabel(" 학과"));
		cp.add(new TextField(""));
		cp.add(new JButton("확인"));
		cp.add(new JLabel(" 과목"));
		cp.add(new TextField(""));
		cp.add(new JButton("확인"));
		
		setSize(300,170);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GridLayoutEx2();
		
	}

}

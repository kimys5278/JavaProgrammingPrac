package Java_Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
		}
		else {
			b.setText("Action");
		}
	}
}

public class IndepClassListener extends JFrame{
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//FlowLayout - > 좌측부터 우측까지 
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		//addActionListener -> 리스너 등록 ->리스너는 MyActionListener 클래스
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListener();

	}

}



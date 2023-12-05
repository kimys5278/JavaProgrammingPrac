package JSwings;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MouseLisenter implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("action")) {
			b.setText("액션");
		}else {
			b.setText("action");
		}
	}
}

public class IndepClassListenerEx2 extends JFrame{
	public IndepClassListenerEx2() {
		setTitle("마우스리스너예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("action");
		btn.addActionListener(new MouseLisenter());
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IndepClassListenerEx2();
	}

}




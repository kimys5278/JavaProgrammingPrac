//package Java_Swing;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//public class MouseListenerALLEx extends JFrame{
//	private JLabel la = new JLabel("No Mouse Event");
//	
//	public MouseListenerALLEx() {
//		setTitle("MouseListener와 MouseMotionListener 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
//		
//		MyMouseListeners listener = 
//				new MyMouseListeners();
//		c.addMouseListener(listener);
//		c.addMouseMotionListener(listener);
//		
//		c.add(la);
//		
//		setSize(300,200);
//		setVisible(true);
//		
//	}
//	  class MyMouseListeners implements MouseListener,MouseMotionListener{
//		public void MousePressed(MouseEvent e) {
//			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
//		}
//		public void MouseReleased(MouseEvent e) {
//			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
//		}
//		public void MouseClicked(MouseEvent e) {
//			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
//		}
//		public void MouseEntered(MouseEvent e) {
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.CYAN);
//		}
//		public void MouseExited(MouseEvent e) {
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.YELLOW);
//		}
//		public void MouseDragged(MouseEvent e) {
//			la.setText("MouseDragged("+e.getX()+","+e.getY()+")");
//		}
//		public void MouseMoved(MouseEvent e) {
//			la.setText("MouseMoved("+e.getX()+","+e.getY()+")");
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new MouseListenerALLEx();
//	}
//
//}

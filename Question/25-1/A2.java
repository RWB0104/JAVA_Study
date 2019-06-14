import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventHandler implements MouseListener
{
	public void mouseClicked(MouseEvent e)
	{
		JButton button = (JButton)e.getComponent();
		button.setText("Clicked");
		System.out.println("Clicked Button" + e.getButton());
		System.out.println("마우스 버튼 눌렀다 풀림");
	}
	
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}

class FrameMouseEventHandler implements MouseListener
{
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("JFrame상에서 마우스 버튼 눌렸다 풀림");
	}
	
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}

class MyJFrame extends JFrame
{
	public MyJFrame(String title)
	{
		super(title);
		setBounds(120, 120, 400, 100);
		setLayout(new FlowLayout());
		addMouseListener(new FrameMouseEventHandler());
	}
}

public class A2
{
	public static void main(String[] args)
	{
		JFrame frm = new MyJFrame("First Swing");
		
		JButton btn1 = new JButton("My Button");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}

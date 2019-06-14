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
		System.out.println("���콺 ��ư ������ Ǯ��");
	}
	
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}

class MyJFrame extends JFrame implements MouseListener
{
	public MyJFrame(String title)
	{
		super(title);
		setBounds(120, 120, 400, 100);
		setLayout(new FlowLayout());
		addMouseListener(this);
		
		JButton btn1 = new JButton("My Button");
		MouseListener listener = new MouseEventHandler();
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		add(btn1);
		add(btn2);
		add(btn3);
	}
	
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("JFrame�󿡼� ���콺 ��ư ���ȴ� Ǯ��");
	}
	
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}

public class A4
{
	public static void main(String[] args)
	{
		JFrame frm = new MyJFrame("First Swing");
		frm.setVisible(true);
	}
}
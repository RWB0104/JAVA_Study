import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PWHandler implements ActionListener
{
	JTextField id;
	JPasswordField pw;
	
	public PWHandler(JTextField id, JPasswordField pw)
	{
		this.id = id;
		this.pw = pw;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("ID : " + id.getText());
		System.out.println("Password : " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}
}

class JLabelAndJTextField
{
	public static void main(String[] args)
	{
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		JLabel idLabel = new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idtext = new JTextField(10);
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		pwText.addActionListener(new PWHandler(idtext, pwText));
		
		frm.add(idLabel);
		frm.add(idtext);
		frm.add(pwLabel);
		frm.add(pwText);
		
		frm.setVisible(true);
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}

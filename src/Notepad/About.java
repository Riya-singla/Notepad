package Notepad;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
	JButton b1;
	About(){
		setBounds(600,200,700,600);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Notepad/images/Attachment-1.png"));
		Image i2=i1.getImage().getScaledInstance(400,80,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(150,40,400,80);
		add(l1);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("Notepad/images/Attachment-1 (1).png"));
		Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l2=new JLabel(i6);
		l2.setBounds(50,180,70,70);
		add(l2);
		
		JLabel l3 =new JLabel("<html>All Rights Reserved<br>Notepad is the word processing program <br>which allows changing of text in computer file,<br> Notepad is a simple text editor for basic text editing programs<br>which enables computer users to create documents.</html>");
		l3.setBounds(150,130,500,300);
		l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
		add(l3);
		b1=new JButton("OK");
		b1.setBounds(580,500,80,25);
		b1.addActionListener(this);
		add(b1);
	}
   public void actionPerformed(ActionEvent ae) {
	   this.setVisible(false);
   }
	

	public static void main(String[] args) {
	 new About().setVisible(true);

	}

}

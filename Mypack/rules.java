package Mypack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener 
{
	JButton b1,b2;
	String username;
	public rules(String username)
	{
		this.username=username;
		setSize(800,500);
		setLocation(280,100);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		JLabel label1=new JLabel("Welcome " +username+ " To MIDSEM Exam");
		label1.setFont(new Font("Arial",Font.BOLD,26));
		label1.setForeground(Color.RED);
		label1.setBounds(150,5,450,150);
		add(label1);
		JLabel label2=new JLabel();
		label2.setBounds(80,80,450,300);
		label2.setText(
			"<html>"+
			"1.	before the start of the examination. Students will only be"+"<br><br>"+
			"2.The students will not be allowed to appear in the examination, "+"<br><br>"+
			"3.No student is allowed to leave the hall before half time"+"<br><br>"+
			"4.Login is for single use only. It will be deactivated automatically after first use."+"<br><br>"+
			"<html>");
		label2.setFont(new Font("Tahoma",Font.PLAIN,16));
		add(label2);

		 b1=new JButton("Close");
		b1.setBounds(80,350,80,35);
		b1.setBackground(new Color(255,51,51));
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);

		 b2=new JButton("Next");
		b2.setBounds(250,350,80,35);
		b2.setBackground(new Color(51,204,255));
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		setVisible(true);
	
	}
	  public void actionPerformed(ActionEvent aee){
        if(aee.getSource()==b1)
			{
            this.setVisible(false);
            new login().setVisible(true);
			}
		else if(aee.getSource() == b2){
            this.setVisible(false);
            new quiz(username).setVisible(true);
        }
    }

	public static void main(String[] args) 
	{
		new rules("");
	}
}

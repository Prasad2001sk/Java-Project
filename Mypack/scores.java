package Mypack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class scores extends JFrame 
{
	
	public scores(String username,int score)
	{
		
		setBounds(500,150,750,500);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("score.jpg"));
		JLabel label=new JLabel(i1);
		label.setBounds(0,0,800,150);
		add(label);
		JLabel l1=new JLabel("Thank You!"+username);
		l1.setBounds(20,400,300,30);
		add(l1);
		JLabel l2=new JLabel("CopyRight@2022");
		l2.setBounds(550,400,300,30);
		add(l2);
		JLabel l3=new JLabel("Your SCore is "+score);
		l3.setBounds(250,200,300,30);
		l3.setFont(new Font("Jokerman",Font.PLAIN,20));
		l3.setForeground(new Color(102,0,153));
		add(l3);
	}
	
	public static void main(String[] args) 
	{
		new scores("",0).setVisible(true);
	}
}

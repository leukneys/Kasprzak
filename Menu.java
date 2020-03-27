package KOTC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.*; 
import java.awt.*;
import java.awt.color.*;
import java.awt.Dimension;


public class Menu extends JFrame {

	private JPanel centerPanel; 
	private JButton button1, button2, button3; 
	
	
	public Menu(){
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(640,480);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		centerPanel = new JPanel(); 
		centerPanel.setLayout(new GridLayout(0, 1, 0, 70));
		centerPanel.setOpaque(false);
	//	centerPanel.setPrefferedSize(new Dimension(300, 480));
		centerPanel.setBackground(Color.white);
		button1 = new JButton("Button1");
		button1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button1.setBackground(new Color(14773412));
        button1.setForeground(Color.white);
        button1.setBounds(40, 100, 100, 60);
        button2 = new JButton("Button2");
		button2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button2.setBackground(new Color(14773412));
        button2.setForeground(Color.white);
        button3 = new JButton("Button3");
		button3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        button3.setBackground(new Color(14773412));
        button3.setForeground(Color.white);
		
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);
        this.add(centerPanel, BorderLayout.CENTER); 
	}
	
public static void main (String[] args) {
		
		Menu frame = new Menu();
		frame.setLocationRelativeTo(null);
		frame.setTitle("Menu test");   
		frame.setLayout(new FlowLayout()); //main
		frame.setVisible(true);
		
	}
    
}

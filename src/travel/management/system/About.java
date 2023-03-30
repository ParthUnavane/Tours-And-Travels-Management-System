package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel ("ABOUT");
        l1.setBounds(175,10,200,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        add(l1);
        
        String s = "About the Project                \n" +
                "\n" +
                "The Objective of the Travel And Tourism Management System Project is to Develop a system that Automates the Processes and Acivities of a Travel and the purpose to design a system using which one can perform all Operations Related to the Travelling. \n " +
                "\n" +
                "This Application will help in Accesing the Information related to the travel to the particular Destination with Great Ease . The users can track the Information related to their tours with great ease Through this Application.The Travel Agency Information can be Obtained Through this Application. \n" +
                "\n" +
                "Advantage of Project : \n" +
                "1) Gives Accurate Information \n" +
                "2) Simplifies the Manual Work \n" +
                "3) It Minimizes the Documentation related work \n" +
                "4) Provides up  to Date Information \n" + 
                "5) Friendly Enviroment by Providing Warning Message \n" +
                "6) Travelers Details can be Provided \n" +
                "7) Booking Confirmation Notifications";
                
        
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        area.setFont(new Font("Times New Roman",Font.PLAIN,15));
        add(area);
        
        JButton back = new JButton("Back");
        back.setBounds(50,450,80,30);
        back.setFont(new Font("Times New Roman",Font.BOLD,20));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String [] args){
        new About();
    }
}

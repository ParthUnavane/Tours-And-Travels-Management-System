package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class CheckPackage extends JFrame {
    
    CheckPackage(){
    
        setBounds(450,200,900,600);
        
        JTabbedPane tab = new JTabbedPane();
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        tab.addTab("Package 1", null, p1);
        add(tab);
        
        JLabel l1 = new JLabel("Gold Package");
        l1.setBounds(50,15,200,35);
        l1.setForeground(new Color(255,215,0));
        l1.setFont(new Font("Times New Roman",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l11 = new JLabel("6 Days 7 Nights");
        l11.setBounds(30,70,300,30);
        l11.setForeground(Color.GREEN);
        l11.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l11);
        
        JLabel l12 = new JLabel("Sky Scraping");
        l12.setBounds(30,120,300,30);
        l12.setForeground(Color.GREEN);
        l12.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l12);
        
        JLabel l13 = new JLabel("City Tour");
        l13.setBounds(30,170,300,30);
        l13.setForeground(Color.GREEN);
        l13.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l13);
        
        JLabel l14 = new JLabel("Daily Buffet");
        l14.setBounds(30,220,300,30);
        l14.setForeground(Color.GREEN);
        l14.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l14);
        
        JLabel l15 = new JLabel("Full 3 Days Island Cruise");
        l15.setBounds(30,270,300,30);
        l15.setForeground(Color.GREEN);
        l15.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l15);
        
        JLabel l16 = new JLabel("Guide");
        l16.setBounds(30,320,300,30);
        l16.setForeground(Color.GREEN);
        l16.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l16);
        
        JLabel l17 = new JLabel("Book Now");
        l17.setBounds(100,410,300,30);
        l17.setForeground(Color.BLACK);
        l17.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l17);
        
        JLabel l18 = new JLabel("Summer Special");
        l18.setBounds(80,460,300,30);
        l18.setForeground(Color.MAGENTA);
        l18.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l18);
        
        JLabel l19 = new JLabel("Rs 30000/-");
        l19.setBounds(500,460,300,30);
        l19.setForeground(Color.MAGENTA);
        l19.setFont(new Font("Tahoma",Font.PLAIN,25));
        p1.add(l19);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
        Image i2= i1.getImage().getScaledInstance(550,400,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l20 = new JLabel(i3);
        l20.setBounds(315,40,550,400);
        p1.add(l20);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        
        tab.addTab("Package 2", null, p2);
        add(tab);
        
        JLabel l2 = new JLabel("Silver Package");
        l2.setBounds(50,15,300,35);
        l2.setForeground(new Color(113,112,110));
        l2.setFont(new Font("Times New Roman",Font.BOLD,30));
        p2.add(l2);
        
        JLabel l21 = new JLabel("5 Days 4 Nights");
        l21.setBounds(30,70,300,30);
        l21.setForeground(new Color(0,139,139));
        l21.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l21);
        
        JLabel l22 = new JLabel("Free Entrance Tickets");
        l22.setBounds(30,120,300,30);
        l22.setForeground(new Color(0,139,139));
        l22.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l22);
        
        JLabel l23 = new JLabel("Greeting at Airport");
        l23.setBounds(30,170,300,30);
        l23.setForeground(new Color(0,139,139));
        l23.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l23);
        
        JLabel l24 = new JLabel("Night Safari");
        l24.setBounds(30,220,300,30);
        l24.setForeground(new Color(0,139,139));
        l24.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l24);
        
        JLabel l25 = new JLabel("Full 2 Days Island Cruise");
        l25.setBounds(30,270,300,30);
        l25.setForeground(new Color(0,139,139));
        l25.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l25);
        
        JLabel l26 = new JLabel("Boating");
        l26.setBounds(30,320,300,30);
        l26.setForeground(new Color(0,139,139));
        l26.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l26);
        
        JLabel l27 = new JLabel("Book Now");
        l27.setBounds(100,410,300,30);
        l27.setForeground(Color.BLACK);
        l27.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l27);
        
        JLabel l28 = new JLabel("Winter Special");
        l28.setBounds(80,460,300,30);
        l28.setForeground(Color.MAGENTA);
        l28.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l28);
        
        JLabel l29 = new JLabel("Rs 20000/-");
        l29.setBounds(500,460,300,30);
        l29.setForeground(Color.MAGENTA);
        l29.setFont(new Font("Tahoma",Font.PLAIN,25));
        p2.add(l29);
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpg"));
        Image i5= i4.getImage().getScaledInstance(550,400,Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l30 = new JLabel(i6);
        l30.setBounds(315,40,550,400);
        p2.add(l30);
        
        
        JPanel p3= new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.WHITE);
        
        tab.addTab("Package 3", null, p3);
        add(tab);
        
        JLabel l3 = new JLabel("Bronze Package");
        l3.setBounds(50,15,300,35);
        l3.setForeground(new Color(205,127,50));
        l3.setFont(new Font("Times New Roman",Font.BOLD,30));
        p3.add(l3);
        
        JLabel l31 = new JLabel("4 Days 4 Nights");
        l31.setBounds(30,70,300,30);
        l31.setForeground(Color.GRAY);
        l31.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l31);
        
        JLabel l32 = new JLabel("Free Clubbing");
        l32.setBounds(30,120,300,30);
        l32.setForeground(Color.GRAY);
        l32.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l32);
        
        JLabel l33 = new JLabel("Full Day Cruise");
        l33.setBounds(30,170,300,30);
        l33.setForeground(Color.GRAY);
        l33.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l33);
        
        JLabel l34 = new JLabel("Horse Riding");
        l34.setBounds(30,220,300,30);
        l34.setForeground(Color.GRAY);
        l34.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l34);
        
        JLabel l35 = new JLabel("Daily Buffet");
        l35.setBounds(30,270,300,30);
        l35.setForeground(Color.GRAY);
        l35.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l35);
        
        JLabel l36 = new JLabel("Return Airfare");
        l36.setBounds(30,320,300,30);
        l36.setForeground(Color.GRAY);
        l36.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l36);
        
        JLabel l37 = new JLabel("Book Now");
        l37.setBounds(100,410,300,30);
        l37.setForeground(Color.BLACK);
        l37.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l37);
        
        JLabel l38 = new JLabel("Monsoon Special");
        l38.setBounds(80,460,300,30);
        l38.setForeground(Color.MAGENTA);
        l38.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l38);
        
        JLabel l39 = new JLabel("Rs 15000/-");
        l39.setBounds(500,460,300,30);
        l39.setForeground(Color.MAGENTA);
        l39.setFont(new Font("Tahoma",Font.PLAIN,25));
        p3.add(l39);
        
        ImageIcon i7= new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpg"));
        Image i8= i7.getImage().getScaledInstance(550,400,Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l40 = new JLabel(i9);
        l40.setBounds(315,40,550,400);
        p3.add(l40);
        
        
        setVisible(true);
        
}
    
    public static void main (String [] args){
        new CheckPackage();
    }
}

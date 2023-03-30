package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonDeatails,checkpackages,bookpackage,viewpackage,viewhotels,destinations,bookhotel;
    JButton viewBookedHotel,payments,calculator,notepad,about,deletePersonalDetails;
    Dashboard(String username){
        this.username = username;
//        setBounds(0,0,1535,825);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,110));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(20,13,40,40);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,110));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        updatePersonDeatails = new JButton("Update Personal Details");
        updatePersonDeatails.setBounds(0,50,300,50);
        updatePersonDeatails.setForeground(Color.WHITE);
        updatePersonDeatails.setBackground(new Color(0,0,102));//255,215,0
        updatePersonDeatails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonDeatails.setMargin(new Insets(0,0,0,30));
        updatePersonDeatails.addActionListener(this);
        p2.add(updatePersonDeatails);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setBackground(new Color(0,0,102));//255,215,0
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setBackground(new Color(0,0,102));//255,215,0
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        
        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0,150,300,50);
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setBackground(new Color(0,0,102));//255,215,0
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,100));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0,200,300,50);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBackground(new Color(0,0,102));//255,215,0
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0,250,300,50);
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setBackground(new Color(0,0,102));//255,215,0
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,300,300,50);
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setBackground(new Color(0,0,102));//255,215,0
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,135));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0,350,300,50);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBackground(new Color(0,0,102));//255,215,0
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,145));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,400,300,50);
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setBackground(new Color(0,0,102));//255,215,0
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,75));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0,450,300,50);
        destinations.setForeground(Color.WHITE);
        destinations.setBackground(new Color(0,0,102));//255,215,0
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payment");
        payments.setBounds(0,500,300,50);
        payments.setForeground(Color.WHITE);
        payments.setBackground(new Color(0,0,102));//255,215,0
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0,550,300,50);
        calculator.setForeground(Color.WHITE);
        calculator.setBackground(new Color(0,0,102));//255,215,0
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0,600,300,45);
        notepad.setForeground(Color.WHITE);
        notepad.setBackground(new Color(0,0,102));//255,215,0
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0,645,300,45);
        about.setForeground(Color.WHITE);
        about.setBackground(new Color(0,0,102));//255,215,0
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        deletePersonalDetails = new JButton("Delete All Details");
        deletePersonalDetails.setBounds(0,690,300,45);
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setBackground(new Color(0,0,102));//255,215,0
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,85));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT );
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.PLAIN,55));
        image.add(text);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if (ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }else if (ae.getSource() == updatePersonDeatails){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkpackages){
            new CheckPackage();
        }else if(ae.getSource() == bookpackage){
            new BookPackage(username);
        }else if(ae.getSource() == viewpackage){
            new ViewPackage(username);
        }else if(ae.getSource() == viewhotels){
            new CheckHotels();
        }else if (ae.getSource() == destinations){
            new Destinations();
        }else if(ae.getSource() == bookhotel){
            new BookHotel(username);
        }else if(ae.getSource() == viewBookedHotel){
            new ViewHotel(username);
        }else if (ae.getSource() == payments){
            new Payment();
        }else if (ae.getSource() == calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == about){
            new About();
        }else if (ae.getSource() == deletePersonalDetails){
            new DeleteDetails(username);
        }
        
        
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}

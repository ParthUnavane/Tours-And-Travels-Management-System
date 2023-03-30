package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener {
    
    JButton create,back;
    JTextField tfname,tfusername,tfanswer;
    Choice security;
    JPasswordField tfpassword;
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //Adding Left Panel
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        //Adding Username Text
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        lblusername.setBounds(50, 20,125,25);
        p1.add(lblusername);
        
        //Adding Text Field for Username
        tfusername = new JTextField();
        tfusername.setBounds(190,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //Adding Name Text
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        lblname.setBounds(50, 60,125,25);
        p1.add(lblname);
        
        //Adding Text Field for Name
        tfname = new JTextField();
        tfname.setBounds(190,60,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        //Adding Password Text
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        lblpassword.setBounds(50, 100,125,25);
        p1.add(lblpassword);
        
        //Adding Text Field for Password
        tfpassword = new JPasswordField();
        tfpassword.setBounds(190,100,200,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //Adding Security Question Text
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        lblsecurity.setBounds(50, 140,125,25);
        p1.add(lblsecurity);
        
        //Dropdown For Questions
        security = new Choice();
        security.add("Your First Pet Name ?");
        security.add("Your Favourite Food ?");
        security.add("Your Favourite Movie ?");
        security.add("What was your Childhood Nickname ?");
        security.setBounds(190,140,200,25);
        p1.add(security);
        
        //Adding Answer Text
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        lblanswer.setBounds(50, 180,125,25);
        p1.add(lblanswer);
        
        //Adding Text Field for Answer
        tfanswer = new JTextField();
        tfanswer.setBounds(190,180,200,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        //Adding Create Button
        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,15));
        create.setBorder(BorderFactory.createEmptyBorder());
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        //Adding Back Button
        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,15));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        //Adding Image in right Plane
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup1.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer=tfanswer.getText();
            
            String query = "insert into account values ('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
            
        }
    }
    
    public static void main(String[] args){
        new Signup();
    }
}

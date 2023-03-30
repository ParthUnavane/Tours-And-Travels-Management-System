package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,signup,fpassword;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    Login(){
        setSize(800,400);
        setLocation(350,200);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        //Adding Left Panel
        JPanel pl=new JPanel();
        pl.setBackground(new Color(131,193,233));
        pl.setBounds(0,0,400,400);
        pl.setLayout(null);
        add(pl);
        
        //Adding Image Icon on Left Panel
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login1.png"));
        Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(70,70,250,250);
        pl.add(image);
        
        //Adding Right Panel
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(370,20,400,330);
        add(p2);
        
        
        //Adding Text as Username
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(60,20,100,25);
        lblusername.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,20));
        p2.add(lblusername);
        
        //Adding Text Field
        tfusername = new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        //Adding Text as Password
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,20));
        p2.add(lblpassword);
        
        //Adding Text Field For Password
        tfpassword = new JPasswordField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        //Adding Login Button
        login = new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        p2.add(login);
        
        //Adding Sign Up Button
        signup = new JButton("Signup");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.addActionListener(this);
        p2.add(signup);
        
        //Adding Button for Forgot Password
        fpassword = new JButton("Forget Password");
        fpassword.setBounds(150,250,130,30);
        fpassword.setBackground(new Color(133,193,233));
        fpassword.setForeground(Color.WHITE);
        fpassword.setBorder(BorderFactory.createEmptyBorder());
        fpassword.addActionListener(this);
        p2.add(fpassword);
        
        //Adding Trouble in Login Text
        JLabel text=new JLabel("Trouble in Login....");
        text.setBounds(250,300,200,25);
        text.setFont(new Font("TIMES_NEW_ROMAN",Font.PLAIN,15));
        text.setForeground(Color.RED);
        p2.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            try{
                String username = tfusername.getText();
                String password = tfpassword.getText();
                
                String query = " select * from account where username = '"+username+"' AND password = '"+password+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()){
                    setVisible(false);
                    new Loading(username);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==signup){
            setVisible(false);
            new Signup();
        } else{
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}

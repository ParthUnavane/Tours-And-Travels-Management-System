package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername,labelprice;
    JButton checkprice,bookhotel,back;
    
    BookHotel(String username){
        this.username = username;
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel text = new JLabel("Book Hotel");
        text.setBounds(100,10,200,50);
        text.setFont(new Font("Tahoma",Font.PLAIN,30));
        text.setForeground(Color.MAGENTA);
        add(text);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40,70,100,25);
        add(lblusername);
        
        labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250,70,200,20);
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setBounds(40,110,150,20);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpackage);
        
        chotel = new Choice();
        chotel.setBounds(250,110,200,25);
        chotel.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(chotel);
        
        
        try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from hotel");
           while(rs.next()){
               chotel.add(rs.getString("name"));
           }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        tfpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfpersons);
        
        JLabel lbldays = new JLabel("No of Days");
        lbldays.setBounds(40,190,200,20);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        tfdays.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(tfdays);
        
        JLabel lblac = new JLabel("AC / Non-AC");
        lblac.setBounds(40,230,150,25);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,25);
        cac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(40,270,150,25);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,25);
        cfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(cfood);
        
        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40,310,150,25);
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblprice);
        
        labelprice = new JLabel();
        labelprice.setBounds(250,310,150,25);
        labelprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelprice);

        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
            }
            }catch(Exception e){
            e.printStackTrace();
        }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.black);
        checkprice.setForeground(Color.white);
        checkprice.setBounds(60,380,120,30);
        checkprice.setFont(new Font("Tahoma",Font.PLAIN,13));
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBackground(Color.black);
        bookhotel.setForeground(Color.white);
        bookhotel.setBounds(200,380,120,30);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,13));
        bookhotel.addActionListener(this);
        add(bookhotel);
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(340,380,120,30);
        back.setFont(new Font("Tahoma",Font.PLAIN,13));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2= i1.getImage().getScaledInstance(500,350,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550,50,500,350);
        add(image);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==checkprice){
            try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+chotel.getSelectedItem()+"'");
            String pack = chotel.getSelectedItem();
                while (rs.next()){
                    int roomcost = Integer.parseInt(rs.getString("costperperson"));
                    int foodcost = Integer.parseInt(rs.getString("foodincluded"));
                    int accost = Integer.parseInt(rs.getString("acroom"));

                    int persons = Integer.parseInt(tfpersons.getText());
                    int days = Integer.parseInt(tfdays.getText());

                    String acselected = cac.getSelectedItem();
                    String foodselected = cfood.getSelectedItem();

                    if (persons * days >0){
                        int totalcost = 0;
                        totalcost +=  acselected.equals("AC") ? accost : 0;
                        totalcost += foodselected.equals("Yes") ? foodcost : 0;
                        totalcost += (roomcost*persons*days);

                        labelprice.setText("Rs "+totalcost);
                    }else{
                        JOptionPane.showMessageDialog(null,"Plase Enter Valid Number");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
                }
        }else if (ae.getSource()== bookhotel){
           try{
               Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Booked Succesfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if (ae.getSource()== back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new BookHotel("parthunavane");
    }
}

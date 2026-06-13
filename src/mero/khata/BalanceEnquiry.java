
package mero.khata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String Pinnumber;
    
        BalanceEnquiry(String Pinnumber){
            this.Pinnumber=Pinnumber;
            setLayout(null);
            
            ImageIcon i1=new ImageIcon("C:/Users/KIIT/Documents/NetBeansProjects/Mero khata/src/icons/atm.jpg");
            Image i2=i1.getImage().getScaledInstance(800,750, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);
            image.setBounds(0,0,800,750);
            add(image);
            
             back=new JButton("BACK");
             back.setBounds(320,420,120,25);
             back.addActionListener(this);
             image.add(back);
             
             connection conn=new connection();
             int balance=0;
            try{
                ResultSet rs=conn.s.executeQuery("Select * from bank where pin='"+Pinnumber+"'");
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-= Integer.parseInt(rs.getString("amount"));
                    }
                }
            }catch(Exception e){
                System.out.println(e);
                
            }
            
            JLabel text=new JLabel("Your Current Account balance is RS "+balance);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("system",Font.BOLD,12));
            text.setBounds(150,300,450,16);
            image.add(text);
                
                
            
        setSize(800,670);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Transaction(Pinnumber).setVisible(true);
            
        }
        
       public static void main (String args[]){
           new BalanceEnquiry("");
       }
    
}    
    


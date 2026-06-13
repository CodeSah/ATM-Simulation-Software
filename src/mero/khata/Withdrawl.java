
package mero.khata;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField amount;
    JButton withdrawl,back;
    String Pinnumber;
    
    Withdrawl(String Pinnumber){
        this.Pinnumber=Pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon("C:/Users/KIIT/Documents/NetBeansProjects/Mero khata/src/icons/atm.jpg");
        Image i2=i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 800,720);
        add(image);
        
        JLabel text=new JLabel ("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        text.setBounds(150,250,400,20);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(150,280,300,24);
        image.add(amount);
        
        withdrawl=new JButton("Withdraw");
        withdrawl.setBounds(330,370,120,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back=new JButton("Back");
        back.setBounds(330,410,120,30);
         back.addActionListener(this);
        image.add(back);
        
         
        setSize(800,670);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            }else {
                try{
                connection conn=new connection();
                String query="insert into bank values('"+Pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS "+number+" Withdrawl Successfully");
                setVisible(false);
                new Transaction(Pinnumber).setVisible(true);
                
                }catch (Exception e){
                    System.out.println(e);
                    
                }
            }
                
            
        }else if(ae.getSource()==back){
            setVisible(false);
           new Transaction(Pinnumber).setVisible(true);
           
        }
    }
    public static void main(String args[]){
        
        new Deposit("");
    }
    
}

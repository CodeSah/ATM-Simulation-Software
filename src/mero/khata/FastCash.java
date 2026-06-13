
package mero.khata;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton deposit,rupees,ministatement,pinchange,balanceenquiry,fastcash,exit;
    String Pinnumber;
    FastCash(String Pinnumber){
        this.Pinnumber=Pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon("C:/Users/KIIT/Documents/NetBeansProjects/Mero khata/src/icons/atm.jpg");
        Image i2=i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 800,720);
        add(image);
       
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT ");
        text.setBounds(190,230,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit=new JButton("Rs 100");
        deposit.setBounds(150,330,130,25);
         deposit.addActionListener(this);
        image.add(deposit);
        
        rupees=new JButton("Rs 500");
        rupees.setBounds(320,330,130,25);
         rupees.addActionListener(this);
        image.add(rupees);
        
        fastcash=new JButton("RS 1000");
        fastcash.setBounds(150,360,130,25);
         fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("RS 2000");
        ministatement.setBounds(320,360,130,25);
         ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("Rs 5000");
        pinchange.setBounds(150,390,130,25);
         pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry=new JButton("RS 10000");
        balanceenquiry.setBounds(320,390,130,25);
         balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit=new JButton("BACK");
        exit.setBounds(320,420,130,25);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        setSize(800,670);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit)
        {
            setVisible(false);
            new Transaction(Pinnumber).setVisible(true);
        }
        else  {
           String amount=((JButton)ae.getSource()).getText().substring(3);
            connection conn=new connection();
            try{
                ResultSet rs=conn.s.executeQuery("Select * from bank where pin='"+Pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                
                Date date=new Date();
                String query="insert into bank values('"+Pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs " + amount + " Debited Successfully");
                
                setVisible(false);
                new Transaction(Pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
           
        }
        
    }
    public static void main(String args[]){
        new FastCash("");
    }
}

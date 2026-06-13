package mero.khata;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Signupthree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton Submit,Cancel;
    String formno;
    Signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3:Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,30,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,90,200,25);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,130,180,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,130,200,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,170,180,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,170,250,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,220,200,25);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-2305");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(320,220,300,25);
        add(number);
        
        JLabel info=new JLabel("Your 16 Digit Card Number");
        info.setFont(new Font("Raleway",Font.ITALIC,16));
        info.setBounds(100,250,330,18);
        add(info);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,280,200,25);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,280,300,25);
        add(pnumber);
        
        JLabel pinfo=new JLabel("Your 4 Digit Password");
        pinfo.setFont(new Font("Raleway",Font.ITALIC,16));
        pinfo.setBounds(100,310,330,18);
        add(pinfo);
        
        JLabel services=new JLabel("Servies Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,345,200,30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,380,200,25);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
         c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,380,200,25);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
         c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,410,200,25);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
         c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,410,200,25);
        add(c4);
        
        
       c5=new JCheckBox("CheckBook");
        c5.setBackground(Color.WHITE);
         c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,435,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
         c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,435,200,30);
        add(c6);
        
        c7=new JCheckBox("Hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,500,600,30);
        add(c7);
        
        Submit=new JButton("Submit");
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.setFont(new Font("Railway",Font.BOLD,14));
        Submit.setBounds(240,600,100,30);
        Submit.addActionListener(this);
        add(Submit);
        
        Cancel=new JButton("Cancel");
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.setFont(new Font("Railway",Font.BOLD,14));
        Cancel.setBounds(410,600,100,30);
         Cancel.addActionListener(this);
        add(Cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        add(number);
        setSize(850,850);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Submit){
            
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
                
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
                
            }else if (r3.isSelected()){
                accountType="Current Account";
                
            }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong() % 90000000L)+504093600000000L);
            
            String Pinnumber=""+Math.abs((random.nextLong() % 9000L)+1000L);
            
            String facility="";
            if(c1.isSelected()){
                facility=facility +"ATM Card";
                
            }else if(c2.isSelected()){
                facility=facility +"Internet Banking";
                
            }else if(c3.isSelected()){
                facility=facility +"Mobile Banking";
            }else if(c4.isSelected()){
                facility =facility +"Email & SMS Alerts";
                
            }else if(c5.isSelected()){
                facility=facility+"E-Statement";
            }  
            try{
                    if(accountType.equals("")){
                        JOptionPane.showMessageDialog(null,"Account Type is Required");
                        
                    }else{
                        connection conn=new connection();
                        String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+Pinnumber+"','"+facility+"')";
                        String query2="insert into login values('"+formno+"','"+cardnumber+"','"+Pinnumber+"')";

                        conn.s.executeUpdate(query1);
                        conn.s.executeUpdate(query2);
                        
                      
                        JOptionPane.showMessageDialog(null,"Card Number:" +cardnumber+ "\n Pin:" +Pinnumber+ "\n\n *Note this card number and pin for login");
                    }
                    setVisible(false);
                    new Login().setVisible(true);
                    new Deposit(Pinnumber).setVisible(false);
                }catch(Exception e){
                    System.out.println(e);
                }
            
            
        }else if(ae.getSource()==Cancel){
        setVisible(false);
        new Login().setVisible(true);
        
    }
    }
    public static void main(String args[]){
        new Signupthree("");
    }
}

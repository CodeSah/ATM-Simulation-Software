
package mero.khata;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin,repin;
    JButton change,back;
    String Pinnumber;
    
    PinChange(String Pinnumber){
        this.Pinnumber=Pinnumber;
        
        setLayout(null);
        ImageIcon i1=new ImageIcon("C:/Users/KIIT/Documents/NetBeansProjects/Mero khata/src/icons/atm.jpg");
        Image i2=i1.getImage().getScaledInstance(800,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 800,720);
        add(image);
       
        JLabel text=new JLabel("CHANGE YOUR PIN");
        text.setBounds(220,230,200,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        JLabel pintext=new JLabel("New PIN:");
        pintext.setBounds(140,275,180,25);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);
        
        pin =new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(300,275,150,25);
        image.add(pin);
        
        JLabel repintext=new JLabel("Re-Enter New PIN:");
        repintext.setBounds(140,315,200,25);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);
        
        repin =new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(300,315,150,25);
        image.add(repin);
        
        change=new JButton("CHANGE");
        change.setBounds(330,380,120,25);
        change.addActionListener(this);
        image.add(change);
        
        back=new JButton("BACK");
        back.setBounds(330,410,120,25);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(800,670);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Enetered PIN doesnot match ");
            }
            
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter new PIN  ");
            }
            
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-enter new PIN  ");
            }
            
            connection conn=new connection();
            String query1="update bank set Pin='"+rpin+"' where Pin='"+Pinnumber+"'";
            String query2="update login set Pin='"+rpin+"' where Pin='"+Pinnumber+"'";
            String query3="update signupthree set Pin='"+rpin+"' where Pin='"+Pinnumber+"'";
            
            conn.s.executeUpdate(query1);
             conn.s.executeUpdate(query2);
              conn.s.executeUpdate(query3);
              
              JOptionPane.showMessageDialog(null, "PIN changed Successfully");
              
              setVisible(false);
              new Transaction(rpin).setVisible(true);
              
            
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            setVisible(false);
            new Transaction(Pinnumber).setVisible(true);
        } 
    }
    
    
    public static void main(String args[]){
        new PinChange("").setVisible(true);
        
    }
}

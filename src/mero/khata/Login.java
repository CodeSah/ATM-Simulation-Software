package mero.khata;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,Clear;
    JTextField cardTextField;
    JPasswordField PinTextField;
   
    Login(){
        
        Image img=new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        this.setIconImage(img);
        
        setTitle("MeroSewa ATM");
        try{
        ImageIcon i1=new ImageIcon("C:/Users/KIIT/Documents/NetBeansProjects/Mero khata/src/icons/logo1.png");
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        setLayout(null);
        JLabel label=new JLabel(i3);
        add(label);
         label.setBounds(70,5,100,200);
        }catch(Exception e){
            System.out.println("Image cannot be found");
        }
       
       JLabel text =new JLabel("Welcome to MeroSewa ATM");
       text.setFont(new Font("Monospaced",Font.BOLD,28));
       text.setBounds(250,40,500,40);
       add(text);
       
        JLabel cardno =new JLabel("Card No:");
       cardno.setFont(new Font("Serif",Font.BOLD,20));
       cardno.setBounds(250,120,200,30);
       add(cardno);
       
       cardTextField=new JTextField();
       cardTextField.setBounds(350,120,230,30);
       cardTextField.setFont(new Font("Arial",Font.BOLD,14));
       add(cardTextField);
       
       
       JLabel pin =new JLabel("PIN:");
       pin.setFont(new Font("Serif",Font.BOLD,20 ));
       pin.setBounds(250,180,200,30);
       add(pin);
       
       PinTextField=new JPasswordField();
       PinTextField.setBounds(350,180,230,30);
       PinTextField.setFont(new Font("Arial",Font.BOLD,14));
       add(PinTextField);
       
       login =new JButton("SIGN IN");
       login.setBounds(350,240,100,30);
       login.setBackground(Color. black);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
       
        Clear =new JButton("CLEAR");
       Clear.setBounds(480,240,100,30);
       Clear.setBackground(Color. black);
       Clear.setForeground(Color.WHITE);
       Clear.addActionListener(this);
       add(Clear);
       
       signup =new JButton("SIGN UP");
       signup.setBounds(350,290,230,30);
       signup.setBackground(Color. black);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);
       add(signup);
       
      
     
        JLabel footerLabel = new JLabel("Developed by");
        footerLabel.setBackground(Color.GRAY);
        add(footerLabel, BorderLayout.SOUTH);
        footerLabel.setBounds(240,335,120,20);
        
        JLabel footerLabel1 = new JLabel("[Khushi sah]");
        footerLabel1.setBackground(Color.RED);
        add(footerLabel1, BorderLayout.SOUTH);
        footerLabel1.setBounds(325,335,200,20);
       
        getContentPane().setBackground(Color.WHITE);
        setSize(700,400);
        setVisible(true);
        
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==Clear){
            cardTextField.setText("");
            PinTextField.setText("");
        }else if (ae.getSource() == login){
          connection conn=new connection();
          String cardnumber =cardTextField.getText();
          String Pinnumber=PinTextField.getText();
          String query= "Select * from login where cardnumber='"+cardnumber+"' and pin='"+Pinnumber+"'";
          try{
             ResultSet rs=conn.s.executeQuery(query);
             if(rs.next()){
                 setVisible(false);
                 new Transaction(Pinnumber).setVisible(true);
             }else{
                 JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
             }
          }catch(Exception e){
              System.out.println(e);
          }
            
        }else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
    }
    public static void main(String args[]){
        new Login();
    }
    
}

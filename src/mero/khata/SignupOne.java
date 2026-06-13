package mero.khata;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,stateTextField,pinTextField ;     
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    JComboBox province,district;
    SignupOne(){
        
        setLayout(null);
        Random ran=new Random();
        random=Math.abs((ran.nextLong() % 9000L)+1000L);
        
        JLabel formno =new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Railway",Font.BOLD,30));
        formno.setBounds(200,20,600,40);
        add(formno);
        
        JLabel personDetails =new JLabel("Page 1:Personal Details");
        personDetails.setFont(new Font("Dialog",Font.BOLD,22));
        personDetails.setBounds(290,70,550,30);
        add(personDetails);
        
        JLabel name =new JLabel("Name:");
        name.setFont(new Font("Dialog",Font.BOLD,20));
        name.setBounds(100,120,100,30);
        add(name);
        
        nameTextField=new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,120,400,30);
        add(nameTextField);
        
        JLabel fname =new JLabel("Father's Name:");
        fname.setFont(new Font("Dialog",Font.BOLD,20));
        fname.setBounds(100,170,150,30);
        add(fname);
        
        fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300,170,400,30);
        add(fnameTextField);
        
        JLabel dob =new JLabel("Date of Birth:");
        dob.setFont(new Font("Dialog",Font.BOLD,20));
        dob.setBounds(100,220,150,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,220,400,30);
        add(dateChooser);
        
        JLabel gender =new JLabel("Gender:");
        gender.setFont(new Font("Dialog",Font.BOLD,20));
        gender.setBounds(100,260,150,30);
        add(gender);
        
        male =new JRadioButton("Male");
        male.setBounds(300,260,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female =new JRadioButton("Female");
        female.setBounds(450,260,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("Dialog",Font.BOLD,20));
        email.setBounds(100,300,150,30);
        add(email);
        
         emailTextField=new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,300,400,30);
        add(emailTextField);
        
        JLabel marital =new JLabel("Marital Status:");
        marital.setFont(new Font("Dialog",Font.BOLD,20));
        marital.setBounds(100,340,150,30);
        add(marital);
        
         married =new JRadioButton("Married");
        married.setBounds(300,340,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried =new JRadioButton("Unmarried");
        unmarried.setBounds(450,340,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other =new JRadioButton("Other");
        other.setBounds(600,340,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        JLabel address =new JLabel("Province:");
        address.setFont(new Font("Dialog",Font.BOLD,20));
        address.setBounds(100,380,150,30);
        add(address);
        
        String valprovince[]={"Select Province","Koshi","Madhesh","Bagmati","Gandaki","Lumbini","Karnali","Sudurpaschmi"};
        province=new JComboBox(valprovince);
        province.setBounds(300,380,400,30);
        province.setBackground(Color.WHITE);
        add(province);
        
        JLabel city =new JLabel("District:");
        city.setFont(new Font("Dialog",Font.BOLD,20));
        city.setBounds(100,430,150,30);
        add(city);
        
        String valDistrict[]={"Select District","Bara","Dhanusha","Mahotari","Parsa","Rautahat","Saptari","Sarlahi","Sirha"};
        district=new JComboBox(valDistrict);
        district.setBounds(300,430,400,30);
        district.setBackground(Color.WHITE);
        add(district);
        
         JLabel muncipality =new JLabel("M.C/S.M.C/MP/RMP :");
        muncipality.setFont(new Font("Dialog",Font.BOLD,20));
        muncipality.setBounds(100,480,200,20);
        add(muncipality);
        
        stateTextField=new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,480,400,30);
        add(stateTextField);
        
        JLabel pincode =new JLabel("Ward No:");
        pincode.setFont(new Font("Dialog",Font.BOLD,20));
        pincode.setBounds(100,530,150,30);
        add(pincode);
        
        pinTextField=new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,530,400,30);
        add(pinTextField);
        
       next =new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.white);
       next.setBounds(620,600,80,30);
       next.addActionListener(this);
       add(next);
       
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno =""+random;//long
        String name =nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if (female.isSelected()){
            gender="Female";
        }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="married";
        }else if (unmarried.isSelected()){
                    marital="unmarried";
                    }
            else if(other.isSelected()){
                    marital="other";
                    }
            String Province=(String)province.getSelectedItem();
            String District=(String)province.getSelectedItem();
            String LocalBody=stateTextField.getText();
            String WardNo=pinTextField.getText();
            
            try{
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"Name is empty");
                }
                
                else if(fname.equals("")){
                    JOptionPane.showMessageDialog(null,"Father's Name is empty");
                }
                
                else if(dob.equals("")){
                    JOptionPane.showMessageDialog(null,"Date of Birth is empty");
                }
                
                else if(email.equals("")){
                    JOptionPane.showMessageDialog(null,"Email is empty");
                }
                
                 else if (Province == null || "Select Province".equals(Province)) {
                    JOptionPane.showMessageDialog(null,"Province is empty");
                }
                 else if (District == null || "Select District".equals(District)) {
                    JOptionPane.showMessageDialog(null,"District is empty");
                }
                else
                {
                    connection c=new connection();
                    String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+Province+"','"+District+"','"+LocalBody+"','"+WardNo+"')";         
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                    
                }
                
            } catch(Exception e){
                        System.out.println(e);
                        }
    }
            


    public static void main(String args[]){
        new SignupOne();
        
    }
}

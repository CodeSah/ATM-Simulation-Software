package mero.khata;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JComboBox religion,occupation,income,education;
    JTextField citizen,pan;     
    JButton next;
    JRadioButton yes,no,eyes,eno;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
      
        
        JLabel additionalDetails =new JLabel("Page 2:Additional Details");
        additionalDetails.setFont(new Font("Dialog",Font.BOLD,22));
        additionalDetails.setBounds(290,70,550,30);
        add(additionalDetails);
        
        JLabel name =new JLabel("Religion:");
        name.setFont(new Font("Dialog",Font.BOLD,20));
        name.setBounds(100,120,100,30);
        add(name);
        
        String valReligion[]={"Select Religion","Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,120,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname =new JLabel("Occupation:");
        fname.setFont(new Font("Dialog",Font.BOLD,20));
        fname.setBounds(100,170,150,30);
        add(fname);
        
        String valOccupation[]={"Select Occupation","Banker","Business","Doctor","Engineer","Housewife","Nurse","Other","Retired","Retired Govt./Pvt./Other","Salaried Govt./Pvt./Other","Self Employed","Teacher"};
        occupation=new JComboBox(valOccupation);
        occupation.setBounds(300,170,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel dob =new JLabel("Income:");
        dob.setFont(new Font("Dialog",Font.BOLD,20));
        dob.setBounds(100,220,150,30);
        add(dob);
        
        String incomeCategory[]={"Select Income","Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
        income=new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300,220,400,30);
        add(income);
        
        JLabel gender =new JLabel("Educational");
        gender.setFont(new Font("Dialog",Font.BOLD,20));
        gender.setBounds(100,270,150,30);
        add(gender);
        
        
        JLabel email =new JLabel("Qualification:");
        email.setFont(new Font("Dialog",Font.BOLD,20));
        email.setBounds(100,300,150,30);
        add(email);
        
        String eductaionValues[]={"Select Education","Non-Graduate","Graduate","Post Graduation","Doctrate","others"};
        education=new JComboBox(eductaionValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300,280,400,30);
        add(education);
        
        
        JLabel address =new JLabel("Citizenship");
        address.setFont(new Font("Dialog",Font.BOLD,20));
        address.setBounds(100,350,150,30);
        add(address);
         JLabel number =new JLabel("Number:");
        number.setFont(new Font("Dialog",Font.BOLD,20));
        number.setBounds(100,380,150,30);
        add(number);
        
        citizen=new JTextField();
        citizen.setFont(new Font("Railway",Font.BOLD,14));
        citizen.setBounds(300,360,400,30);
        add(citizen);
        
        JLabel city =new JLabel("PAN Number:");
        city.setFont(new Font("Dialog",Font.BOLD,20));
        city.setBounds(100,420,150,30);
        add(city);
        
        pan=new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,14));
        pan.setBounds(300,420,400,30);
        add(pan);
        
         JLabel state =new JLabel("Senior Citizen:");
        state.setFont(new Font("Dialog",Font.BOLD,20));
        state.setBounds(100,470,150,30);
        add(state);
        
        yes =new JRadioButton("Yes");
        yes.setBounds(300,470,60,30);
        yes.setBackground(Color.white);
        add(yes);
        
        no =new JRadioButton("No");
        no.setBounds(450,470,120,30);
        no.setBackground(Color.white);
        add(no);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(yes);
        seniorgroup.add(no);
        
         JLabel pincode =new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Dialog",Font.BOLD,20));
        pincode.setBounds(100,520,180,30);
        add(pincode);
        
       
        
       eyes =new JRadioButton("Yes");
        eyes.setBounds(300,520,60,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno =new JRadioButton("No");
        eno.setBounds(450,520,120,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup accountgroup=new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
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
       
        String Religion =(String)religion.getSelectedItem();
        String Occupation=(String)occupation.getSelectedItem();
        String Income=(String)income.getSelectedItem();
        String Education=(String)education.getSelectedItem();
         String Citizenship=citizen.getText();
          String PanNo=pan.getText();
        String SeniorCitizen=null;
        if(yes.isSelected()){
            SeniorCitizen="Yes";
        }else if (no.isSelected()){
            SeniorCitizen="No";
        }
        
        String ExisitingAccount=null;
        if(eyes.isSelected()){
            ExisitingAccount="Yes";
        }
        else if(eno.isSelected()){
                    ExisitingAccount="No";
                    }
            
   
            
            try{
                if (Religion == null || "Select Religion".equals(Religion)) {
                    JOptionPane.showMessageDialog(null,"Religion is empty");
                }
                 else if (Occupation == null || "Select Occupation".equals(Occupation)) {
                    JOptionPane.showMessageDialog(null,"Occupation is empty");
                }
                else if (Income == null || "Select Income".equals(Income)) {
                    JOptionPane.showMessageDialog(null,"Income is empty");
                    
                }else if (Education == null || "Select Education".equals(Education)) {
                    JOptionPane.showMessageDialog(null,"Education is empty");
                }
                
                else if(Citizenship.equals("")){
                    JOptionPane.showMessageDialog(null,"Citizenship No. is empty");
                }
                else if(PanNo.equals("")){
                    JOptionPane.showMessageDialog(null,"PanNo is empty");
                }
                else{
                    connection c=new connection();
                    String query="insert into signuptwo values('"+formno+"','"+Religion+"','"+Occupation+"','"+Income+"','"+Education+"','"+Citizenship+"','"+PanNo+"','"+SeniorCitizen+"','"+ExisitingAccount+"')";         
                    c.s.executeUpdate(query);
                    
                    setVisible(false);
                    new Signupthree(formno).setVisible(true);
                    
                }
            }
             catch(Exception e){
                        System.out.println(e);
                        }
    }
            


    public static void main(String args[]){
        new SignupTwo("");
        
    }
}

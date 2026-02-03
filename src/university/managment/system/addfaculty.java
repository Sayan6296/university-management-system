package university.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class addfaculty extends JFrame implements ActionListener {
    JTextField TextName,TextFather,TextAddress,TextPhone,TextEmail,TextM10,TextM12,TextAn;
    JLabel empText;;
    JDateChooser cdob;
    JComboBox courseBox,dmBox;
    JButton submit,cancel;

    Random ran = new Random();
    long f4 = Math.abs((ran.nextLong() % 9000L)+1000L);

    addfaculty(){

        getContentPane().setBackground(new Color(166,164,252));

        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(260,30,500,50);
        heading.setFont(new Font("Verdana",Font.BOLD,30));
        heading.setForeground(Color.white);
        add(heading);

        //Name

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setForeground(Color.white);
        add(name);

        TextName = new JTextField();
        TextName.setBounds(190,150,200,30);
        add(TextName);

        //Father's Name

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(430,150,200,30);
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setForeground(Color.white);
        add(fname);

        TextFather = new JTextField();
        TextFather.setBounds(600,150,200,30);
        add(TextFather);

        //Employee ID

        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,200,30);
        empID.setFont(new Font("Arial",Font.BOLD,20));
        empID.setForeground(Color.white);
        add(empID);

        empText = new JLabel("1500"+f4);
        empText.setBounds(190,200,200,30);
        empText.setFont(new Font("Arial",Font.BOLD,20));
        empText.setForeground(Color.white);
        add(empText);

        //DOB

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(430,200,300,30);
        dob.setFont(new Font("Arial",Font.BOLD,20));
        dob.setForeground(Color.white);
        add(dob);

        cdob = new JDateChooser();
        cdob.setBounds(600,200,200,30);
        add(cdob);

        // Address

        JLabel address = new JLabel("Address");
        address.setBounds(50,250,100,30);
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setForeground(Color.white);
        add(address);

        TextAddress = new JTextField();
        TextAddress.setBounds(190,250,200,30);
        add(TextAddress);

        //Phone

        JLabel phone = new JLabel("Phone No.");
        phone.setBounds(430,250,200,30);
        phone.setFont(new Font("Arial",Font.BOLD,20));
        phone.setForeground(Color.white);
        add(phone);

        TextPhone = new JTextField();
        TextPhone.setBounds(600,250,200,30);
        add(TextPhone);

        //Email ID

        JLabel email = new JLabel("Email ID");
        email.setBounds(50,300,100,30);
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setForeground(Color.white);
        add(email);

        TextEmail = new JTextField();
        TextEmail.setBounds(190,300,200,30);
        add(TextEmail);

        //10th Marks

        JLabel m10 = new JLabel("Class X (%)");
        m10.setBounds(430,300,200,30);
        m10.setFont(new Font("Arial",Font.BOLD,20));
        m10.setForeground(Color.white);
        add(m10);

        TextM10 = new JTextField();
        TextM10.setBounds(600,300,200,30);
        add(TextM10);

        //12th Marks

        JLabel m12 = new JLabel("Class XII (%)");
        m12.setBounds(50,350,200,30);
        m12.setFont(new Font("Arial",Font.BOLD,20));
        m12.setForeground(Color.white);
        add(m12);

        TextM12 = new JTextField();
        TextM12.setBounds(190,350,200,30);
        add(TextM12);

        //Aadhaar No.

        JLabel an = new JLabel("Aadhaar Number");
        an.setBounds(430,350,200,30);
        an.setFont(new Font("Arial",Font.BOLD,20));
        an.setForeground(Color.white);
        add(an);

        TextAn = new JTextField();
        TextAn.setBounds(600,350,200,30);
        add(TextAn);

        //Qualification

        JLabel qualification = new JLabel("Qualification");
        qualification.setBounds(50,400,200,30);
        qualification.setFont(new Font("Arial",Font.BOLD,20));
        qualification.setForeground(Color.white);
        add(qualification);

        String course[] ={"BTech","BCom","BBA","BCA","BPharm","BSC","BA","MTech","MCom","MBA","MCA","MPharm","MA"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(190,400,200,30);
        courseBox.setBackground(Color.white);
        courseBox.setFont(new Font("Inter",Font.BOLD,15));
        add(courseBox);

        //Department

        JLabel dm= new JLabel("Department");
        dm.setBounds(430,400,200,30);
        dm.setFont(new Font("Arial",Font.BOLD,20));
        dm.setForeground(Color.white);
        add(dm);

        String department[] ={"Computer Science","Electronics","Civil","Mechanical","IT"};
        dmBox = new JComboBox(department);
        dmBox.setBounds(600,400,200,30);
        dmBox.setBackground(Color.white);
        dmBox.setFont(new Font("Inter",Font.BOLD,15));
        add(dmBox);

        //Submit Button

        submit = new JButton("Submit");
        submit.setBounds(240,500,150,50);
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
        submit.setFont(new Font("Verdana", Font.BOLD, 20));
        submit.addActionListener(this);
        submit.setFocusPainted(false);
        add(submit);

        //cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(450,500,150,50);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        cancel.setFont(new Font("Verdana", Font.BOLD, 20));
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,900,700);
        add(img);




        setSize(900,700);
        setLayout(null);
        setLocation(250,50);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){

            String name = TextName.getText();
            String fname = TextFather.getText();
            String emp_ID = empText.getText();
            String dob = ((JTextField) cdob.getDateEditor().getUiComponent()).getText();
            String address = TextAddress.getText();
            String ph_no  = TextPhone.getText();
            String email_ID = TextEmail.getText();
            String class_x = TextM10.getText();
            String class_xii = TextM12.getText();
            String aadhaar = TextAn.getText();
            String course = (String) courseBox.getSelectedItem();
            String department = (String) dmBox.getSelectedItem();
            try{
                String q = "insert into teacher values('"+name+"','"+fname+"','"+emp_ID+"','"+dob+"','"+address+"','"+ph_no+"','"+email_ID+"','"+class_x+"','"+class_xii+"','"+aadhaar+"','"+course+"','"+department+"')";
                conn C = new conn();
                C.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Inserted");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
      new addfaculty();
    }
}

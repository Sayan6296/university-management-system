package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class UpdateStudent extends JFrame implements ActionListener {
    JTextField TextAddress,TextPhone,TextEmail,TextAn,TextCourse,TextBranch;

    JLabel empText;;

    JButton submit,cancel;

    Choice ch;

    UpdateStudent(){
        getContentPane().setBackground(new Color(230,210,252));

        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(50,10,500,50);
        heading.setFont(new Font("Verdana",Font.BOLD,35));
        heading.setForeground(Color.white);
        add(heading);

        //select emp ID

        JLabel empID = new JLabel("Select Roll No");
        empID.setBounds(50,100,200,20);
        empID.setFont(new Font("Verdana",Font.BOLD,20));
        empID.setForeground(Color.white);
        add(empID);

        //choice

        ch = new Choice();
        ch.setBounds(250,100,200,20);
        add(ch);

        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from student");
            while(rs.next()){
                ch.add(rs.getString("roll_no"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //Name

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setForeground(Color.white);
        add(name);

        JLabel TextName = new JLabel();
        TextName.setBounds(190,150,200,30);
        TextName.setForeground(Color.white);
        TextName.setFont(new Font("Arial",Font.BOLD,18));
        add(TextName);

        //Father's Name

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(430,150,200,30);
        fname.setFont(new Font("Arial",Font.BOLD,20));
        fname.setForeground(Color.white);
        add(fname);

        JLabel TextFather = new JLabel();
        TextFather.setBounds(600,150,200,30);
        TextFather.setForeground(Color.white);
        TextFather.setFont(new Font("Arial",Font.BOLD,18));
        add(TextFather);

        //Employee ID

        JLabel emID = new JLabel("Roll No");
        emID.setBounds(50,200,200,30);
        emID.setFont(new Font("Arial",Font.BOLD,20));
        emID.setForeground(Color.white);
        add(emID);

        empText = new JLabel();
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

        JLabel cdob = new JLabel();
        cdob.setBounds(600,200,200,30);
        cdob.setForeground(Color.white);
        cdob.setFont(new Font("Arial",Font.BOLD,18));
        add(cdob);

        // Address

        JLabel address = new JLabel("Address");
        address.setBounds(50,250,100,30);
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setForeground(Color.white);
        add(address);

        TextAddress = new JTextField();
        TextAddress.setBounds(190,250,200,30);
        TextAddress.setForeground(Color.black);
        TextAddress.setFont(new Font("Arial",Font.BOLD,18));
        add(TextAddress);

        //Phone

        JLabel phone = new JLabel("Phone No.");
        phone.setBounds(430,250,200,30);
        phone.setFont(new Font("Arial",Font.BOLD,20));
        phone.setForeground(Color.white);
        add(phone);

        TextPhone = new JTextField();
        TextPhone.setBounds(600,250,200,30);
        TextPhone.setForeground(Color.black);
        TextPhone.setFont(new Font("Arial",Font.BOLD,18));
        add(TextPhone);

        //Email ID

        JLabel email = new JLabel("Email ID");
        email.setBounds(50,300,100,30);
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setForeground(Color.white);
        add(email);

        TextEmail = new JTextField();
        TextEmail.setBounds(190,300,200,30);
        TextEmail.setForeground(Color.black);
        TextEmail.setFont(new Font("Arial",Font.BOLD,18));
        add(TextEmail);

        //10th Marks

        JLabel m10 = new JLabel("Class X (%)");
        m10.setBounds(430,300,200,30);
        m10.setFont(new Font("Arial",Font.BOLD,20));
        m10.setForeground(Color.white);
        add(m10);

        JLabel TextM10 = new JLabel();
        TextM10.setBounds(600,300,200,30);
        TextM10.setForeground(Color.white);
        TextM10.setFont(new Font("Arial",Font.BOLD,18));
        add(TextM10);

        //12th Marks

        JLabel m12 = new JLabel("Class XII (%)");
        m12.setBounds(50,350,200,30);
        m12.setFont(new Font("Arial",Font.BOLD,20));
        m12.setForeground(Color.white);
        add(m12);

        JLabel TextM12 = new JLabel();
        TextM12.setBounds(190,350,200,30);
        TextM12.setForeground(Color.white);
        TextM12.setFont(new Font("Arial",Font.BOLD,18));
        add(TextM12);

        //Aadhaar No.

        JLabel an = new JLabel("Aadhaar Number");
        an.setBounds(430,350,200,30);
        an.setFont(new Font("Arial",Font.BOLD,20));
        an.setForeground(Color.white);
        add(an);

        TextAn = new JTextField();
        TextAn.setBounds(600,350,200,30);
        TextAn.setForeground(Color.black);
        TextAn.setFont(new Font("Arial",Font.BOLD,18));
        add(TextAn);

        //Qualification

        JLabel qualification = new JLabel("Courses");
        qualification.setBounds(50,400,200,30);
        qualification.setFont(new Font("Arial",Font.BOLD,20));
        qualification.setForeground(Color.white);
        add(qualification);

        TextCourse = new JTextField();
        TextCourse.setBounds(190,400,200,30);
        TextCourse.setForeground(Color.black);
        TextCourse.setFont(new Font("Arial",Font.BOLD,18));
        add(TextCourse);

        //Department

        JLabel dm= new JLabel("Branch");
        dm.setBounds(430,400,200,30);
        dm.setFont(new Font("Arial",Font.BOLD,20));
        dm.setForeground(Color.white);
        add(dm);

        TextBranch = new JTextField();
        TextBranch.setBounds(600,400,200,30);
        TextBranch.setForeground(Color.black);
        TextBranch.setFont(new Font("Arial",Font.BOLD,18));
        add(TextBranch);

        try{
            conn c = new conn();
            String q1 = "select * from student where roll_no ='"+ch.getSelectedItem()+"'";
            ResultSet rs1 = c.statement.executeQuery(q1);
            while(rs1.next()){
                TextName.setText(rs1.getString("name"));
                TextFather.setText(rs1.getString("fname"));
                cdob.setText(rs1.getString("dob"));
                TextAddress.setText(rs1.getString("address"));
                TextPhone.setText(rs1.getString("ph_no"));
                TextEmail.setText(rs1.getString("email_ID"));
                TextM10.setText(rs1.getString("class_x"));
                TextM12.setText(rs1.getString("class_xii"));
                TextAn.setText(rs1.getString("aadhaar_number"));
                TextCourse.setText(rs1.getString("courses"));
                TextBranch.setText(rs1.getString("branch"));
                empText.setText(rs1.getString("roll_no"));

            }
        }catch (Exception E){
            E.printStackTrace();
        }

        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    conn c = new conn();
                    String q1 = "select * from student where emp_ID ='"+ch.getSelectedItem()+"'";
                    ResultSet rs1 = c.statement.executeQuery(q1);
                    while(rs1.next()) {
                        TextName.setText(rs1.getString("name"));
                        TextFather.setText(rs1.getString("fname"));
                        cdob.setText(rs1.getString("dob"));
                        TextAddress.setText(rs1.getString("address"));
                        TextPhone.setText(rs1.getString("ph_no"));
                        TextEmail.setText(rs1.getString("email_ID"));
                        TextM10.setText(rs1.getString("class_x"));
                        TextM12.setText(rs1.getString("class_xii"));
                        TextAn.setText(rs1.getString("aadhaar_number"));
                        TextCourse.setText(rs1.getString("courses"));
                        TextBranch.setText(rs1.getString("branch"));
                        empText.setText(rs1.getString("roll_no"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        //Submit Button

        submit = new JButton("Update");
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/sbg.png"));
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
        if (e.getSource() == submit){
            String rollno = empText.getText();
            String address = TextAddress.getText();
            String ph_no = TextPhone.getText();
            String email_ID = TextEmail.getText();
            String course = TextCourse.getText();
            String branch = TextBranch.getText();

            try{
                String Q = "update student set address = '"+address+"',ph_no = '"+ph_no+"',email_ID = '"+email_ID+"',courses = '"+course+"',branch = '"+branch+"' where roll_no ='"+rollno+"'";
                conn c = new conn();
                c.statement.executeUpdate(Q);

                JOptionPane.showMessageDialog(null,"Details Updated");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateStudent();
    }
}

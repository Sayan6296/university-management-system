package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class StudentFeesForm extends JFrame implements ActionListener {

    Choice ch;

    JLabel tableAmount ;

    JButton update,pay,back;

    JComboBox courseBox,dmBox,smbox;

    StudentFeesForm(){

        getContentPane().setBackground(new Color(210,252,251));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/fees.png"));
        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(340,50,400,300);
        add(img);

        JLabel rn = new JLabel("Select Roll No");
        rn.setBounds(40,60,150,20);
        rn.setFont(new Font("Verdana",Font.BOLD,18));
        rn.setForeground(Color.white);
        add(rn);

        ch = new Choice();
        ch.setBounds(200,60,125,25);
        ch.setFont(new Font("Inter",Font.BOLD,15));
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
        name.setBounds(40,100,150,20);
        name.setFont(new Font("Verdana",Font.BOLD,18));
        name.setForeground(Color.white);
        add(name);

        JLabel textName = new JLabel();
        textName.setBounds(200,100,150,20);
        textName.setFont(new Font("Verdana",Font.BOLD,16));
        textName.setForeground(Color.white);
        add(textName);

        // father's name

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(40,140,150,20);
        fname.setFont(new Font("Verdana",Font.BOLD,18));
        fname.setForeground(Color.white);
        add(fname);

        JLabel textfName = new JLabel();
        textfName.setBounds(200,140,150,20);
        textfName.setFont(new Font("Verdana",Font.BOLD,16));
        textfName.setForeground(Color.white);
        add(textfName);

        try{
            conn c = new conn();
            String q = "select * from student where roll_no = '"+ch.getSelectedItem()+"'";
            ResultSet rs1 = c.statement.executeQuery(q);

            while(rs1.next()){
                textName.setText(rs1.getString("name"));
                textfName.setText(rs1.getString("fname"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ch.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try{
                    conn c = new conn();
                    String q = "select * from student where roll_no = '"+ch.getSelectedItem()+"'";
                    ResultSet rs1 = c.statement.executeQuery(q);

                    while(rs1.next()){
                        textName.setText(rs1.getString("name"));
                        textfName.setText(rs1.getString("fname"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        //Qualification

        JLabel qualification = new JLabel("Course");
        qualification.setBounds(40,180,150,20);
        qualification.setFont(new Font("Verdana",Font.BOLD,18));
        qualification.setForeground(Color.white);
        add(qualification);

        String course[] ={"BTech","BCom","BBA","BCA","BPharm","BSC","BA","MTech","MCom","MBA","MCA","MPharm","MA"};
        courseBox = new JComboBox(course);
        courseBox.setBounds(190,180,150,25);
        courseBox.setBackground(Color.white );
        courseBox.setFont(new Font("Inter",Font.BOLD,15));
        add(courseBox);

        //Department

        JLabel dm= new JLabel("Branch");
        dm.setBounds(40,220,150,20);
        dm.setFont(new Font("Verdana",Font.BOLD,18));
        dm.setForeground(Color.white);
        add(dm);

        String department[] ={"Computer Science","Electronics","Civil","Mechanical","IT"};
        dmBox = new JComboBox(department);
        dmBox.setBounds(190,220,150,25);
        dmBox.setBackground(Color.white);
        dmBox.setFont(new Font("Inter",Font.BOLD,15));
        add(dmBox);

        JLabel sem = new JLabel("Semester");
        sem.setBounds(40,260,150,20);
        sem.setFont(new Font("Verdana",Font.BOLD,18));
        sem.setForeground(Color.white);
        add(sem);

        String semester[] = {"semester1","semester2","semester3","semester4","semester5","semester6","semester7","semester8"};
        smbox = new JComboBox(semester);
        smbox.setBounds(190,260,150,25);
        smbox.setFont(new Font("Inter",Font.BOLD,15));
        smbox.setBackground(Color.white);
        add(smbox);

        JLabel total = new JLabel("Total Payable");
        total.setBounds(40,300,150,20);
        total.setFont(new Font("Verdana",Font.BOLD,16));
        total.setForeground(Color.white);
        add(total);

        tableAmount = new JLabel();
        tableAmount.setBounds(200,300,150,20);
        tableAmount.setFont(new Font("Inter",Font.BOLD,15));
        tableAmount.setForeground(Color.white);
        add(tableAmount);

        update = new JButton("Update");
        update.setBounds(30,380,100,28);
        update.setFont(new Font("Verdana",Font.BOLD,12));
        update.setForeground(Color.black);
        update.setFocusPainted(false);
        update.addActionListener(this);
        add(update);

        pay = new JButton("Pay");
        pay.setBounds(150,380,100,28);
        pay.setFont(new Font("Verdana",Font.BOLD,12));
        pay.setForeground(Color.black);
        pay.addActionListener(this);
        pay.setFocusPainted(false);
        add(pay);

        back = new JButton("Back");
        back.setBounds(270,380,100,28);
        back.setFont(new Font("Verdana",Font.BOLD,12));
        back.setForeground(Color.black);
        back.addActionListener(this);
        back.setFocusPainted(false);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/febg.jpg"));
        Image i22 = i11.getImage().getScaledInstance(900,500,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,900,500);
        add(image);

        setSize(740,500);
        setLocation(400,100);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == update){
            String course = (String) courseBox.getSelectedItem();
            String semester = (String) smbox.getSelectedItem();

            try{
                conn c = new conn();
                ResultSet rs2 = c.statement.executeQuery("select * from fees where course ='"+course+"'");
                while(rs2.next()){
                    tableAmount.setText(rs2.getString(semester));
                }

            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() ==  pay) {
            String roll_no = ch.getSelectedItem();
            String course = (String) courseBox.getSelectedItem();
            String semester = (String) smbox.getSelectedItem();
            String branch = (String) dmBox.getSelectedItem();
            String total = tableAmount.getText();

            try{
                conn c = new conn();
                String Q = "insert into feecollege values('"+roll_no+"','"+course+"','"+branch+"','"+semester+"','"+total+"')";
                c.statement.executeUpdate(Q);

                JOptionPane.showMessageDialog(null,"Fees Submitted Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new StudentFeesForm();
    }
}

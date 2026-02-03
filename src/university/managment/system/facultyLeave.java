package university.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class facultyLeave extends JFrame implements ActionListener {

    Choice ch, tch;
    JDateChooser sldt;
    JButton submit,cancel;
    facultyLeave(){
        getContentPane().setBackground(new Color(210,232,252));

        JLabel heading = new JLabel("Apply Leave (Teacher)");
        heading.setBounds(40,50,300,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        heading.setForeground(Color.white);
        add(heading);

        JLabel rnse = new JLabel("Search By Emp ID");
        rnse.setBounds(60,145,300,30);
        rnse.setFont(new Font("Verdana",Font.BOLD,20));
        rnse.setForeground(Color.white);
        add(rnse);

        ch = new Choice();
        ch.setBounds(60,180,200,22);
        add(ch);

        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from teacher");
            while(rs.next()){
                ch.add(rs.getString("emp_ID"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        JLabel dt = new JLabel("Date");
        dt.setBounds(60,230,200,20);
        dt.setFont(new Font("Verdana",Font.BOLD,20));
        dt.setForeground(Color.white);
        add(dt);

        sldt = new JDateChooser();
        sldt.setBounds(60,260,200,25);
        add(sldt);

        JLabel timed = new JLabel("Time Duration");
        timed.setBounds(60,310,200,20);
        timed.setFont(new Font("Verdana",Font.BOLD,20));
        timed.setForeground(Color.white);
        add(timed);

        tch = new Choice();
        tch.setBounds(60,340,200,20);
        tch.add("Full Day");
        tch.add("Half Day");
        tch.setFont(new Font("Verdana",Font.BOLD,15));
        add(tch);

        submit = new JButton("Submit");
        submit.setBounds(60,410,100,30);
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        submit.setFocusPainted(false);
        submit.setFont(new Font("Verdana",Font.BOLD,15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(200,410,100,30);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        cancel.setFont(new Font("Verdana",Font.BOLD,15));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/vfd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,550,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,500,550);
        add(img);

        setSize(500,550);
        setLocation(550,100);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==  submit){
            String emp_ID = ch.getSelectedItem();
            String date =((JTextField) sldt.getDateEditor().getUiComponent()).getText();
            String time = tch.getSelectedItem();

            if(date == null || date.trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Please select a date first");
                return;
            }

            String q = "insert into tleave values('"+emp_ID+"','"+date+"','"+time+"')";
            try{
                conn c = new conn();
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Leave Confirmed");
                setVisible(false);
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new facultyLeave();
    }
}

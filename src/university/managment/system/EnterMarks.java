package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EnterMarks extends JFrame implements ActionListener {

    Choice ch;

    JComboBox cb;

    JTextField sub1, sub2, sub3, sub4, sub5, mrk1, mrk2, mrk3, mrk4, mrk5;

    JButton submit, cancel;

    EnterMarks(){
        getContentPane().setBackground(new Color(252,245,210));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/exam.png"));
        Image i2 = i1.getImage().getScaledInstance(350,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(620,30,350,400);
        add(img);

        JLabel heading = new JLabel("Enter Marks of Students");
        heading.setBounds(50,0,500,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        heading.setForeground(Color.white);
        add(heading);

        JLabel rollno = new JLabel("Select Roll No");
        rollno.setBounds(50,60,180,20);
        rollno.setFont(new Font("Verdana",Font.BOLD,20));
        rollno.setForeground(Color.white);
        add(rollno);

        ch = new Choice();
        ch.setBounds(240,60,180,20);
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

        JLabel sem = new JLabel("Semester");
        sem.setBounds(50,110,180,20);
        sem.setFont(new Font("Verdana",Font.BOLD,20));
        sem.setForeground(Color.white);
        add(sem);

        String semester[] = {"1st Semester","2nd Semester","3rd Semester","4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};
        cb = new JComboBox(semester);
        cb.setBounds(200,110,150,20);
        cb.setBackground(Color.white);
        add(cb);

        JLabel enterSub = new JLabel("Enter Subject");
        enterSub.setBounds(90,150,200,40);
        enterSub.setFont(new Font("Verdana",Font.BOLD,20));
        enterSub.setForeground(Color.white);
        add(enterSub);

        JLabel enterMarks = new JLabel("Enter Marks");
        enterMarks.setBounds(350,150,200,40);
        enterMarks.setFont(new Font("Verdana",Font.BOLD,20));
        enterMarks.setForeground(Color.white);
        add(enterMarks);

        sub1 = new JTextField();
        sub1.setBounds(50,200,250,21);
        add(sub1);

        sub2 = new JTextField();
        sub2.setBounds(50,230,250,21);
        add(sub2);

        sub3 = new JTextField();
        sub3.setBounds(50,260,250,21);
        add(sub3);

        sub4 = new JTextField();
        sub4.setBounds(50,290,250,21);
        add(sub4);

        sub5 = new JTextField();
        sub5.setBounds(50,320,250,21);
        add(sub5);

        mrk1 = new JTextField();
        mrk1.setBounds(300,200,250,21);
        add(mrk1);

        mrk2 = new JTextField();
        mrk2.setBounds(300,230,250,21);
        add(mrk2);

        mrk3 = new JTextField();
        mrk3.setBounds(300,260,250,21);
        add(mrk3);

        mrk4 = new JTextField();
        mrk4.setBounds(300,290,250,21);
        add(mrk4);

        mrk5 = new JTextField();
        mrk5.setBounds(300,320,250,21);
        add(mrk5);

        submit = new JButton("Submit");
        submit.setBounds(110,370,170,40);
        submit.setFont(new Font("Verdana",Font.BOLD,20));
        submit.addActionListener(this);
        submit.setFocusPainted(false);
        submit.setBackground(Color.white);
        submit.setForeground(Color.black);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(310,370,170,40);
        cancel.setFont(new Font("Verdana",Font.BOLD,20));
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        add(cancel);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/markbg.jpg"));
        Image i22 = i11.getImage().getScaledInstance(1000,500,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,1000,500);
        add(image);

        setSize(1000,500);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            try{
                conn c = new conn();
                String q1 = "insert into subject values('"+ch.getSelectedItem()+"','"+cb.getSelectedItem()+"','"+sub1.getText()+"','"+sub2.getText()+"','"+sub3.getText()+"','"+sub4.getText()+"','"+sub5.getText()+"')";
                String q2 ="insert into marks values('"+ch.getSelectedItem()+"','"+cb.getSelectedItem()+"','"+mrk1.getText()+"','"+mrk2.getText()+"','"+mrk3.getText()+"','"+mrk4.getText()+"','"+mrk5.getText()+"')";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Marks Inserted Succesfully");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new EnterMarks();
    }
}

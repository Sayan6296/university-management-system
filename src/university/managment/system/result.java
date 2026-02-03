package university.managment.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class result extends JFrame implements ActionListener{
    String roll_no,sem;
    JButton cancel;

    result(String roll_no,String sem){
        this.roll_no = roll_no;
        this.sem = sem;

        setLayout(null);
        setSize(500,600);
        setLocation(500,100);

        JLabel heading = new JLabel("S.D Technical University");
        heading.setBounds(100,10,500,25);
        heading.setFont(new Font("Verdana",Font.BOLD,20));
        heading.setForeground(Color.white);
        add(heading);

        JLabel name =  new JLabel("Result of Examination 2026");
        name.setBounds(100,50,500,20);
        name.setForeground(Color.white);
        name.setFont(new Font("Verdana",Font.BOLD,20));
        add(name);

        JLabel roll = new JLabel("Roll No  " + roll_no);
        roll.setBounds(60,100,500,20);
        roll.setFont(new Font("Verdana",Font.BOLD,20));
        roll.setForeground(Color.white);
        add(roll);


        JLabel seme = new JLabel("Semester " + sem);
        seme.setBounds(60,130,500,20);
        seme.setFont(new Font("Verdana",Font.BOLD,20));
        seme.setForeground(Color.white);
        add(seme);

        JLabel subj1 = new JLabel();
        subj1.setBounds(100,200,500,20);
        subj1.setForeground(Color.white);
        subj1.setFont(new Font("Verdana",Font.BOLD,18));
        add(subj1);

        JLabel subj2 = new JLabel();
        subj2.setBounds(100,250,500,20);
        subj2.setForeground(Color.white);
        subj2.setFont(new Font("Verdana",Font.BOLD,18));
        add(subj2);

        JLabel subj3 = new JLabel();
        subj3.setBounds(100,300,500,20);
        subj3.setForeground(Color.white);
        subj3.setFont(new Font("Verdana",Font.BOLD,18));
        add(subj3);

        JLabel subj4 = new JLabel();
        subj4.setBounds(100,350,500,20);
        subj4.setForeground(Color.white);
        subj4.setFont(new Font("Verdana",Font.BOLD,18));
        add(subj4);

        JLabel subj5 = new JLabel();
        subj5.setBounds(100,400,500,20);
        subj5.setForeground(Color.white);
        subj5.setFont(new Font("Verdana",Font.BOLD,18));
        add(subj5);

        try{
            conn c = new conn();
            ResultSet rs1 = c.statement.executeQuery("select * from subject where roll_no ='"+roll_no+"' and sem ='"+sem+"'");
            while(rs1.next()){
                subj1.setText(rs1.getString("subj1"));
                subj2.setText(rs1.getString("subj2"));
                subj3.setText(rs1.getString("subj3"));
                subj4.setText(rs1.getString("subj4"));
                subj5.setText(rs1.getString("subj5"));

            }

            ResultSet rs2 = c.statement.executeQuery("select * from marks where roll_no ='"+roll_no+"' and sem = '"+sem+"'");
            if(rs2.next()){
                subj1.setText(subj1.getText() + "-----------" + rs2.getString("mark1"));
                subj2.setText(subj2.getText() + "-----------" + rs2.getString("mark2"));
                subj3.setText(subj3.getText() + "-----------" + rs2.getString("mark3"));
                subj4.setText(subj4.getText() + "-----------" + rs2.getString("mark4"));
                subj5.setText(subj5.getText() + "-----------" + rs2.getString("mark5"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/sbg.png"));
        Image i2 = i1.getImage().getScaledInstance(500,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,500,600);
        add(img);

        cancel = new JButton("Cancel");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.white);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        cancel.setFont(new Font("Verdana", Font.BOLD, 15));
        add(cancel);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new result("","");
    }
}
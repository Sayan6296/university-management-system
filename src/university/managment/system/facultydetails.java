package university.managment.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class facultydetails extends JFrame implements ActionListener {

    Choice ch;

    JTable table;

    JButton search,print,add,update,cancel;

    facultydetails(){
        getContentPane().setBackground(new Color(210,252,218));

        JLabel heading = new JLabel("Search By Emp ID");
        heading.setBounds(20,20,230,40);
        heading.setFont(new Font("Verdana",Font.BOLD,20));
        heading.setForeground(Color.white);
        add(heading);

        ch = new Choice();
        ch.setBounds(250,30,160,30);
        ch.setFont(new Font("verdana",Font.BOLD,15));
        add(ch);

        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from teacher");
            while(rs.next()){
                ch.add(rs.getString("emp_ID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();
        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from teacher");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        } catch (Exception e) {
            e.printStackTrace();
        }
        table.setForeground(Color.white);
        table.setFont(new Font("Arial",Font.PLAIN,12));

        JScrollPane js = new JScrollPane(table);
        js.setBounds(20,140,850,350);
        add(js);

        table.setOpaque(false);
        table.setBackground(new Color(0,0,0,0));

        js.setOpaque(false);
        js.getViewport().setOpaque(false);
        js.getViewport().setBackground(new Color(0,0,0,0));


        search = new JButton("Search");
        search.setBounds(20,100,80,20);
        search.addActionListener(this);
        search.setFocusPainted(false);
        add(search);

        print = new JButton("Print");
        print.setBounds(120,100,80,20);
        print.addActionListener(this);
        print.setFocusPainted(false);
        add(print);

        add = new JButton("Add");
        add.setBounds(220,100,80,20);
        add.addActionListener(this);
        add.setFocusPainted(false);
        add(add);

        update = new JButton("Update");
        update.setBounds(320,100,80,20);
        update.addActionListener(this);
        update.setFocusPainted(false);
        add(update);

        cancel  = new JButton("Cancel");
        cancel.setBounds(420,100,80,20);
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/fd.png"));
        Image i2 = i1.getImage().getScaledInstance(900,600,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,900,600);
        add(img);


        setLayout(null);
        setSize(900,600);
        setLocation(300,90);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==search){
            String q = "select * from teacher where emp_ID ='"+ch.getSelectedItem()+"'";
            try{
                conn c = new conn();
                ResultSet rs = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == print) {
            try{
                table.print();
            }catch (Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == add) {
            setVisible(false);
            new addfaculty();
        } else if (e.getSource() == update) {
            setVisible(false);
            new UpdateTeacher();
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new facultydetails();
    }
}

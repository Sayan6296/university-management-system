package university.managment.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class examDetails extends JFrame implements ActionListener {

    JTextField search;
    JComboBox semBox;

    JButton result,back;

    JTable table;


    examDetails(){
        getContentPane().setBackground(new Color(241,252,210));

        JLabel heading = new JLabel("Check Result");
        heading.setBounds(400,15,400,50);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        heading.setForeground(Color.white);
        add(heading);

        search = new JTextField();
        search.setBounds(80,90,180,30);
        search.setFont(new Font("Tahoma",Font.BOLD,18));
        add(search);

        String semester[] = {"1st Semester","2nd Semester","3rd Semester","4th Semester","5th Semester","6th Semester","7th Semester","8th Semester"};
        semBox = new JComboBox(semester);
        semBox.setBounds(280,90,180,30);
        semBox.setFont(new Font("Tahoma",Font.BOLD,18));
        add(semBox);


        result = new JButton("Result");
        result.setBounds(480,90,120,30);
        result.setFont(new Font("Verdana",Font.BOLD,20));
        result.setForeground(Color.black);
        result.setBackground(Color.white);
        result.addActionListener(this);
        result.setFocusPainted(false);
        add(result);

        back = new JButton("Back");
        back.setBounds(630,90,120,30);
        back.setFont(new Font("Verdana",Font.BOLD,20));
        back.setForeground(Color.black);
        back.setBackground(Color.white);
        back.addActionListener(this);
        back.setFocusPainted(false);
        add(back);


        table = new JTable();
        table.setForeground(Color.white);
        table.setFont(new Font("Arial",Font.PLAIN,12));


        JScrollPane js = new JScrollPane(table);
        js.setBounds(30,130,920,280);
        js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        add(js);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/sd.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,475,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,1000,475);
        add(img);

        table.setOpaque(false);
        table.setBackground(new Color(0,0,0,0));



        js.setOpaque(false);
        js.getViewport().setOpaque(false);
        js.getViewport().setBackground(new Color(0,0,0,0));

        try{
            conn c = new conn();
            ResultSet rs = c.statement.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch (Exception e){
            e.printStackTrace();
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row,2).toString());
            }
        });

        setSize(1000,475);
        setLocation(300,100);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==result){
            setVisible(false);
           new result(search.getText(), semBox.getSelectedItem().toString());

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new examDetails();
    }
}

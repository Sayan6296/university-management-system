package university.managment.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FeesStructure extends JFrame implements ActionListener {


    FeesStructure(){
        getContentPane().setBackground(Color.white);

        JLabel heading = new JLabel("Fees Structure");
        heading.setBounds(350,30,400,30);
        heading.setFont(new Font("Verdana",Font.BOLD,30));
        heading.setForeground(Color.white);
        add(heading);

        JTable tb = new JTable();
         try{
             conn c = new conn();
             ResultSet rs = c.statement.executeQuery("select * from fees");
             tb.setModel(DbUtils.resultSetToTableModel(rs));
         }catch (Exception e ){
             e.printStackTrace();
         }

         tb.setForeground(Color.white);
         tb.setFont(new Font("Arial",Font.PLAIN,12));

         JScrollPane js = new JScrollPane(tb);
         js.setBounds(20,100,945,150);
         add(js);

        tb.setOpaque(false);
        tb.setBackground(new Color(0,0,0,0));

        js.setOpaque(false);
        js.getViewport().setOpaque(false);
        js.getViewport().setBackground(new Color(0,0,0,0));

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/fbg.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel img = new JLabel(i3);
         img.setBounds(0,0,1000,700);
         add(img);



         setSize(1000,350);
         setLocation(250,200);
         setLayout(null);
         setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new FeesStructure();
    }
}

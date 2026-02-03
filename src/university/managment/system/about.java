package university.managment.system;

import javax.swing.*;
import java.awt.*;

public class about extends JFrame  {

    about(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/about.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(460,44,200,200);
        add(img);

        JLabel heading = new JLabel("<html>S.D</br> Technical University</html>");
        heading.setBounds(40,50,430,130);
        heading.setFont(new Font("Verdana",Font.BOLD,30));
        heading.setForeground(Color.white);
        add(heading);

        JLabel name = new JLabel("Sayan Dutta");
        name.setBounds(50,260,550,40);
        name.setFont(new Font("Arial",Font.BOLD,30));
        name.setForeground(Color.white);
        add(name);

        JLabel contact = new JLabel("sayandutta322@gmail.com");
        contact.setBounds(50,340,550,40);
        contact.setFont(new Font("Arial",Font.BOLD,30));
        contact.setForeground(Color.white);
        add(contact);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/fd.png"));
        Image i22 = i11.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgE = new JLabel(i33);
        imgE.setBounds(0,0,700,500);
        add(imgE);



        setSize(700,500);
        setLocation(400,100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new about();
    }
}

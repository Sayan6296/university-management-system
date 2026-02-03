package university.managment.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JTextField TextFieldName;

    JPasswordField PasswordField;

    JButton login,cancel;

    login(){

        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40,35,100,20);
        labelName.setFont(new Font("Courier New", Font.BOLD, 16));
        labelName.setForeground(Color.black);
        add(labelName);

        TextFieldName = new JTextField();
        TextFieldName.setBounds(150,35,150,20);
        add(TextFieldName);

        JLabel labelPass =new JLabel("Password");
        labelPass.setBounds(40,90,100,20);
        labelPass.setFont(new Font("Courier New", Font.BOLD, 16));
        labelPass.setForeground(Color.black);
        add(labelPass);

        PasswordField = new JPasswordField();
        PasswordField.setBounds(150,90,150,20);
        add(PasswordField);

        login = new JButton("Login");
        login.setBounds(40,160,120,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.setFont(new Font("Courier New", Font.BOLD, 16));
        login.addActionListener(this);
        login.setFocusPainted(false);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180,160,120,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Courier New", Font.BOLD, 16));
        cancel.addActionListener(this);
        cancel.setFocusPainted(false);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/person.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,20,200,200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/loginback.png"));
        Image i22 = i11.getImage().getScaledInstance(600,300,Image.SCALE_SMOOTH);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);


        setSize(600,300);
        setLocation(400,230);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login){
            String username = TextFieldName.getText();
            String password = PasswordField.getText();

            String query = "select *from login where username = '"+username+"'and password ='"+password+"' ";
            try{
                conn c = new conn();
                ResultSet resultSet = c.statement.executeQuery(query);

                if(resultSet.next()){
                    setVisible(false);
                    new main_class();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}

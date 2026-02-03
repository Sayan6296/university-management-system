package university.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main_class extends JFrame implements ActionListener {

    main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/university.png"));
        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        //new information

        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.black);
        newInfo.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        //Details

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.black);
        details.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(details);

        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        facultyDetails.setBackground(Color.white);
        facultyDetails.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);

        JMenuItem studentDetails = new JMenuItem("View Student Details");
        studentDetails.setBackground(Color.white);
        studentDetails.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        studentDetails.addActionListener(this);
        details.add(studentDetails);

        //Leave

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.black);
        leave.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.white);
        facultyLeave.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.white);
        studentLeave.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        //Leave Details

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.black);
        leaveDetails.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(leaveDetails);

        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.white);
        facultyLeaveDetails.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);

        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.white);
        studentLeaveDetails.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);

        //Exam

        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.black);
        exam.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Result");
        ExaminationDetails.setBackground(Color.white);
        ExaminationDetails.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.white);
        EnterMarks.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        //Update Info

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.black);
        updateInfo.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(updateInfo);

        JMenuItem ufd = new JMenuItem("Update Faculty Details");
        ufd.setBackground(Color.white);
        ufd.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        ufd.addActionListener(this);
        updateInfo.add(ufd);

        JMenuItem usd = new JMenuItem("Update Student Details");
        usd.setBackground(Color.white);
        usd.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        usd.addActionListener(this);
        updateInfo.add(usd);

        //Fees

        JMenu fee = new JMenu("Fees Details");
        fee.setForeground(Color.black);
        fee.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(fee);

        JMenuItem fs = new JMenuItem("Fees Structure");
        fs.setBackground(Color.white);
        fs.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        fs.addActionListener(this);
        fee.add(fs);

        JMenuItem ff = new JMenuItem("Student Fees Form");
        ff.setBackground(Color.white);
        ff.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        ff.addActionListener(this);
        fee.add(ff );

        //Utility

        JMenu ut = new JMenu("Utility");
        ut.setForeground(Color.black);
        ut.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(ut);

        JMenuItem cc = new JMenuItem("Calculator");
        cc.setBackground(Color.white);
        cc.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        cc.addActionListener(this);
        ut.add(cc);

        JMenuItem np = new JMenuItem("NotePad");
        np .setBackground(Color.white);
        np .setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        np.addActionListener(this);
        ut.add(np);

        //about

        JMenu ab = new JMenu("About");
        ab.setForeground(Color.black);
        ab.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(ab);

        JMenuItem bu = new JMenuItem("About Us");
        bu.setBackground(Color.white);
        bu.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        bu.addActionListener(this);
        ab.add(bu);

        //Exit

        JMenu ex = new JMenu("Exit");
        ex.setForeground(Color.black);
        ex.setFont(new Font("Segoe UI", Font.BOLD, 15));
        mb.add(ex);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.white);
        Exit.setFont(new Font("Comic Sans MS", Font.BOLD ,14));
        Exit.addActionListener(this);
        ex.add(Exit);

        setJMenuBar(mb);

        setSize(1540,850);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String sd = e.getActionCommand();

        switch (sd) {

            case "Exit":
                System.exit(0);
                break;

            case "Calculator":
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception E) {
                    E.printStackTrace();
                }
                break;

            case "NotePad":
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception E) {
                    E.printStackTrace();
                }
                break;

            case "New Faculty Information":
                new addfaculty();
                break;

            case "New Student Information":
                new addStudent();
                break;

            case "View Faculty Details":
                new facultydetails();
                break;

            case "View Student Details":
                new studentdetails();
                break;

            case "Faculty Leave":
                new facultyLeave();
                break;

            case "Student Leave":
                new Studentleave();
                break;

            case "Student Leave Details":
                new sld();
                break;

            case "Faculty Leave Details":
                new fld();
                break;

            case "Enter Marks":
                new EnterMarks();
                break;

            case "Update Faculty Details":
                new UpdateTeacher();
                break;

            case "Update Student Details":
                new UpdateStudent();
                break;

            case "Examination Result":
                new examDetails();
                break;

            case "Fees Structure":
                new FeesStructure();
                break;

            case "Student Fees Form":
                new StudentFeesForm();
                break;

            case "About Us":
                new about();
                break;
        }
    }


    public static void main(String[] args) {
        new main_class();
    }
}

package university.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;

    Statement statement;

    conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/universitymanagement",
                    "root","Sayan@6296");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new conn();
    }
}

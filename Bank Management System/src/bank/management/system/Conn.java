package bank.management.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Udit@6969");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
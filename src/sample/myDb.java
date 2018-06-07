package sample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myDb {

    private static final String URL="jdbc:mysql://localhost:3306/test_kcs";
    private static final String Name="root";
    private static final String Pass="";

public static Connection createConnection(){
    Connection connection=null;

    try {
        connection = DriverManager.getConnection(URL,Name,Pass);

    }catch (SQLException e){
        System.out.println(""+e);
    }


    return connection;
}




}

package Module110.jdbcApp2IndusrtyStyle;

import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertQuerry
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

        //Code to execute InsertQuery

        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Establish the Connection
        String url = "jdbc:mysql://localhost:3306/pwskillsbatch";
        String user = "root";
        String password = "targetatlas@1234";
        Connection connection = DriverManager.getConnection(url, user, password);
    
        //Create a Statement Object
        Statement statement = connection.createStatement();

        // Execute the query
        String sqlInsertQuery = "insert into student(sid,sname,sage,saddress) values(18,'kohli',49,'MI')"; 
        int rowAffected =statement.executeUpdate(sqlInsertQuery);

        //prosess the result
        if(rowAffected == 1)
        {
            System.out.println("No of rows affected is : " + rowAffected);
        }
        else
        {
            System.out.println("Not succesfull in insertion...");
        }


        //close the resources
        
        statement.close();
        connection.close();
       
    }
}

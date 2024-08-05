package Module110;

import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class updateQuerry 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

        //Code to execute updateQuery

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
        String sqlUpdateQuery = "update student set sname ='Sachin' where sid=10"; 
        int rowAffected =statement.executeUpdate(sqlUpdateQuery);

        //prosess the result
        if(rowAffected == 1)
        {
            System.out.println("No of rows affected is : " + rowAffected);
        }
        else
        {
            System.out.println("No record found for updation");
        }


        //close the resources
        
        statement.close();
        connection.close();
       
    }
}

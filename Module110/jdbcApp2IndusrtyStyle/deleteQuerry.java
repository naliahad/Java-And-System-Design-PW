package Module110.jdbcApp2IndusrtyStyle;

import java.sql.Statement; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class deleteQuerry 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

        //Code to execute DeleteQuery

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
        String sqlDeleteQuery = "delete from student where sid =18"; 
        int rowAffected =statement.executeUpdate(sqlDeleteQuery);

        //prosess the result
        if(rowAffected == 1)
        {
            System.out.println("No of rows affected is : " + rowAffected);
        }
        else
        {
            System.out.println("No record found for deletion");
        }


        //close the resources
        
        statement.close();
        connection.close();
       
    }
}

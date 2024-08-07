package Module110.jdbcApp2IndusrtyStyle.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil 
{
    static
    {
        //load and register the driver
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }

    public static Connection getDBConnection() throws SQLException
    {
        //Establish the Connection
        String url = "jdbc:mysql://localhost:3306/pwskillsbatch";
        String user = "root";
        String password = "targetatlas@1234";
        return DriverManager.getConnection(url, user, password);
    }

    public static void closeResources(ResultSet resultSet, Statement statement, Connection connection) throws SQLException
    {
        if(resultSet !=null)
        resultSet.close();

        if(statement!=null)
        statement.close();

        if(connection!=null)
        connection.close();

    }

    public static Connection getDbConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDbConnection'");
    }
}

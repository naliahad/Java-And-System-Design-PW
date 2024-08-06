package Module110.jdbcApp2IndusrtyStyle;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import Module110.jdbcApp2IndusrtyStyle.Utility.JdbcUtil; 

public class selectQuerry 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

        //Resourses used

        Connection connection = null;
        Statement statement =  null;
        ResultSet  resultSet = null;
        
        try 
        {

            //Getting the connection
            connection =  JdbcUtil.getDBConnection();

            if(connection != null)
            statement = connection.createStatement();

            if(statement != null)
            resultSet = statement.executeQuery("selerct sid,sname,sage,saddress from student");
            
            if(resultSet != null)
            {
                System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
                while(resultSet.next())
                {
                    System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" + resultSet.getInt(3)
                    + "\t" + resultSet.getString(4));
                }
            }
        
        }    
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        
        finally 
        {
            //Closing the resources
            try
            {
                JdbcUtil.closeResources(resultSet, statement, connection);
            }

            catch (SQLException e)
            {
                e.printStackTrace();
            }

            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
